package starter.backend.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link starter.backend.model.DBUser}
 */
@AllArgsConstructor
@Getter
public class DBUserDto implements Serializable {
    private final Long id;
    private final String username;
    private final Set<RoleDto> roles;
}