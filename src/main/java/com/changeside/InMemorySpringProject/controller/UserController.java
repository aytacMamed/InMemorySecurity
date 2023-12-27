package com.changeside.InMemorySpringProject.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to site";
    }
    @GetMapping("/user/userProfile")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String userProfile(){
        return "welcome to User profile";
    }

    @GetMapping("/admin/adminProfile")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String adminProfile(){
        return "welcome to Admin Profile";
    }
}
