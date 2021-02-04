package auth;

import entity.Users;

import java.util.Optional;

public interface AuthenticationService {
    Optional<Users> doAuth(String name, String password);

//    Optional<User> doIndividual(String nickname);
}
