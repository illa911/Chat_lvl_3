package auth;

import entity.Users;


import java.util.List;
import java.util.Optional;

public class BasicAuthenticationService implements AuthenticationService {

    Users user;

    @Override
    public Optional<Users> doAuth(String name, String password) {

        DBUserAuth dbUserAuth = new DBUserAuth();
        dbUserAuth.findUser(name, password);
            if (dbUserAuth.findUser(name, password) != null) {
                return Optional.of(user);


        }

        return Optional.empty();
    }
}
