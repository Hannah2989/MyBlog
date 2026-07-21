package com.miniproject.myblog.applicationUser;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class ApplicationUserController {

    private final ApplicationUserService applicationUserService;

    public ApplicationUserController(ApplicationUserService applicationUserService) {
        this.applicationUserService = applicationUserService;
    }

    @PostMapping
    public void save(@ModelAttribute ApplicationUser applicationUser) {
        applicationUserService.save(applicationUser);
    }

    @GetMapping("/{username}/{password}")
    public ApplicationUser findByUsernameAndPassword(@PathVariable String username, @PathVariable String password) {
        return applicationUserService.findByUsernameAndPassword(username, password);
    }
}
