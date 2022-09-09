package com.example.spring_boot_task_withsecurity.repositoryImpl.repository;

import com.example.spring_boot_task_withsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select u from User u where u.username = :username")
    User getUserByUsername(@Param("username") String username);

}
