package starter.backend.service.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import starter.backend.model.DBUser;
import starter.backend.service.dto.DBUserDto;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DBUserMapper {

    private final RoleMapper roleMapper;

    public Set<DBUserDto> toDTOs(List<DBUser> users) {
        return users.stream()
                .map(this::toDTO)
                .collect(Collectors.toSet());
    }

    public DBUserDto toDTO(DBUser user) {
        return new DBUserDto(user.getId(), user.getUsername(), roleMapper.toDTOs(user.getRoles()));
    }
}
