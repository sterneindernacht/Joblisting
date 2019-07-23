package sterneindernacht.com.github.joblisting.authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sterneindernacht.com.github.joblisting.authorization.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}