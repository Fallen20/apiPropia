package com.example.apiPropia.repository;

import com.example.apiPropia.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    User findByUsername(String username);//como se logean?con el
}
