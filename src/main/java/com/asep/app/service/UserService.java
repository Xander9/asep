package com.asep.app.service;

import com.asep.app.entity.AuthUser;
import com.asep.app.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    boolean createUser(User user);

    List<User> getUser();

    Optional<User> findById(String id);

    User update(User user, String l);

    void deleteUserById(String userId);

    User updatePartially(User user, String id);

    User getUserByEmail(AuthUser authUser);
}
