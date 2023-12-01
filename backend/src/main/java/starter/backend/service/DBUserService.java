package starter.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import starter.backend.repository.DBUserRepository;
import starter.backend.service.dto.DBUserDto;
import starter.backend.service.mapper.DBUserMapper;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class DBUserService {

    private final DBUserRepository dbUserRepository;
    private final DBUserMapper dbUserMapper;

    public Set<DBUserDto> findAll() {
        return dbUserMapper.toDTOs(this.dbUserRepository.findAll());
    }
}
