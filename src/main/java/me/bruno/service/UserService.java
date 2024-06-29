package me.bruno.service;

import me.bruno.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
