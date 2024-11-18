package ru.javastudent.spring_boot.dao;

import ru.javastudent.spring_boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();
    void addUser(User user);
    void deleteUser(User user);
    void editUser(User user);
    User getUserById(Long id);
}
