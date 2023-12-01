package starter.backend.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import starter.backend.model.RoleConstant;

@RestController
public class LoginController {

    @PreAuthorize("hasAuthority('" + RoleConstant.USER + "')")
    @GetMapping("user")
    public String getUser() {
        return "Welcome, User";
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
