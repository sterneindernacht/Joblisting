package sterneindernacht.com.github.joblisting.auth.service;

import sterneindernacht.com.github.joblisting.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
