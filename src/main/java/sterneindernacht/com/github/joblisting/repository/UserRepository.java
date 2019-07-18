package sterneindernacht.com.github.joblisting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sterneindernacht.com.github.joblisting.authorization.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}