package com.example.spring_security.repo;

import com.example.spring_security.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
