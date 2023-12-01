package starter.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import starter.backend.model.DBUser;

public interface DBUserRepository extends JpaRepository<DBUser, Long> {

    public DBUser findByUsername(String username);
}
