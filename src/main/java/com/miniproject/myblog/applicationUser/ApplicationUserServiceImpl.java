package com.miniproject.myblog.applicationUser;

import org.springframework.stereotype.Service;

import java.util.List;

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
    public void delete(int id) {
        applicationUserRepository.deleteById(id);
    }

    @Override
    public ApplicationUser findById(int id) {
        return applicationUserRepository.findById(id).orElse(null);
    }

    @Override
    public List<ApplicationUser> findAll() {
        return applicationUserRepository.findAll();
    }

    public  ApplicationUser findByUsernameAndPassword(String username,String password){
        return applicationUserRepository.findByUsernameAndPassword(username, password);
    }
}
