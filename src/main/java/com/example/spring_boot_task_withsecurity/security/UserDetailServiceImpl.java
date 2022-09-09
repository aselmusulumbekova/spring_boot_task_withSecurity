package com.example.spring_boot_task_withsecurity.security;

import com.example.spring_boot_task_withsecurity.entity.SecurityUser;
import com.example.spring_boot_task_withsecurity.entity.User;
import com.example.spring_boot_task_withsecurity.repositoryImpl.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getUserByUsername(username);
        if (user == null)
        {
            throw new UsernameNotFoundException("could not found user!");
        }
        return new SecurityUser(user);
    }
}
