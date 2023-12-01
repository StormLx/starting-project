package starter.backend.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import starter.backend.model.RoleConstant;
import starter.backend.service.DBUserService;
import starter.backend.service.dto.DBUserDto;

import java.util.Set;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final DBUserService dbUserService;

    @PreAuthorize("hasAuthority('" + RoleConstant.ADMIN + "')")
    @GetMapping("users")
    public Set<DBUserDto> getUser() {
        return dbUserService.findAll();
    }

    @PreAuthorize("hasAuthority('" + RoleConstant.ADMIN + "')")
    @GetMapping("admin")
    public String getAdmin() {
        return "Welcome, Admin";
    }

    @PreAuthorize("hasAuthority('" + RoleConstant.MANAGER + "')")
    @GetMapping("manager")
    public String getManager() {
        return "Welcome, Manager";
    }
}
