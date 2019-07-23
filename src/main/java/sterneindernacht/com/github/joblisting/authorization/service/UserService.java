package sterneindernacht.com.github.joblisting.authorization.service;

import sterneindernacht.com.github.joblisting.authorization.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
