package sterneindernacht.com.github.joblisting.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sterneindernacht.com.github.joblisting.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}