package com.hehe.service;

import com.hehe.pojo.User;
import java.util.List;

public interface UserService {

    List<User> list();

    List<User> findByUsername(String username);

    User get(String userId);
    List<User> findByPasswords(String password);
    int delete(String userId);

}
