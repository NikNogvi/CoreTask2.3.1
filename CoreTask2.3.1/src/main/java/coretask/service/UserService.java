package coretask.service;

import coretask.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void edit(int id, User user);
    User getById(int id);
}
