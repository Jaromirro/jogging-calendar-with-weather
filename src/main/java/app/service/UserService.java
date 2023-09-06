package app.service;


import app.entity.User;

public interface UserService {
    void save(User user);

    User findByName(String name);

}
