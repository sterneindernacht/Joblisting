package sterneindernacht.com.github.joblisting.service;

import sterneindernacht.com.github.joblisting.authorization.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
