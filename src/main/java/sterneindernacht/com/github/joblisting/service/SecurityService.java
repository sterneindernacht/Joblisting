package sterneindernacht.com.github.joblisting.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}