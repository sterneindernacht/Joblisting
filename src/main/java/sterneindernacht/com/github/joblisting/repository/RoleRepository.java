package sterneindernacht.com.github.joblisting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sterneindernacht.com.github.joblisting.authorization.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}