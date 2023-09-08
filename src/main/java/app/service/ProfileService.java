package app.service;


import app.entity.Profile;
import app.entity.User;

public interface ProfileService {
    void save(Profile profile);

    Profile findByName(String firstName);

}
