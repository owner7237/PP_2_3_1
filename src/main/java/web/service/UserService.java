package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void delete(User user);
    void deleteById(Long id);
    void update(User user);
    User getUser(long id);
    void clearTable();

    List<User> listUsers();
}
