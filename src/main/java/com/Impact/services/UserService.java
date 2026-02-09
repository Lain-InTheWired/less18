package com.Impact.services;

import com.Impact.database.UserStore;
import com.Impact.models.User;

public class UserService {

    private final UserStore store = new UserStore();

    public User createUser(User user) {
        User newUser = new User(
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                user.getRole()
        );

        return store.save(newUser);
    }
}

