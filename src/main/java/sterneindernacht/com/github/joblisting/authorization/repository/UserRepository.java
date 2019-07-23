package sterneindernacht.com.github.joblisting.authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sterneindernacht.com.github.joblisting.authorization.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}