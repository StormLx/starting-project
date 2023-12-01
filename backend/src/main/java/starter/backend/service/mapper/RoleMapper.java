package starter.backend.service.mapper;

import org.springframework.stereotype.Service;
import starter.backend.model.Role;
import starter.backend.service.dto.RoleDto;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RoleMapper {
    public Set<RoleDto> toDTOs(Set<Role> roles) {
        return roles.stream()
                .map(this::toDTO)
                .collect(Collectors.toSet());
    }

    public RoleDto toDTO(Role role) {
        return new RoleDto(role.getId(), role.getName());
    }
}
