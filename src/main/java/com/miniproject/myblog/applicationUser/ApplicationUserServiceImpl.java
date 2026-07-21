package com.miniproject.myblog.applicationUser;

import org.springframework.stereotype.Service;

@Service
public class ApplicationUserServiceImpl implements ApplicationUserService{

    private final ApplicationUserRepository applicationUserRepository;

    public ApplicationUserServiceImpl(ApplicationUserRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }

    @Override
    public void save(ApplicationUser applicationUser) {
        applicationUserRepository.save(applicationUser);
    }

    @Override
    public  ApplicationUser findByUsernameAndPassword(String username,String password){
        return applicationUserRepository.findByUsernameAndPassword(username, password);
    }
}
