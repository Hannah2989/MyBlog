package com.miniproject.myblog.applicationUser;

import java.util.List;

public interface ApplicationUserService {

    void save(ApplicationUser applicationUser);

    void delete(int id);

    ApplicationUser findById(int id);

    List<ApplicationUser> findAll();

    ApplicationUser findByUsernameAndPassword(String username, String password);
}

