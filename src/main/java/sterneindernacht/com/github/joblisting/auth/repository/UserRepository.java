package sterneindernacht.com.github.joblisting.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sterneindernacht.com.github.joblisting.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}