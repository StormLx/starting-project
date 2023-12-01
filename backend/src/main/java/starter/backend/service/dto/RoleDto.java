package starter.backend.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * DTO for {@link starter.backend.model.Role}
 */
@AllArgsConstructor
@Getter
public class RoleDto implements Serializable {
    private final Long id;
    private final String name;
}