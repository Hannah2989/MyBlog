package com.miniproject.myblog.applicationUser;

public interface ApplicationUserService {

    void save(ApplicationUser applicationUser);

    ApplicationUser findByUsernameAndPassword(String username, String password);
}

