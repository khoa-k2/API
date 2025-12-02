package com.example.demoapi.repo;

import com.example.demoapi.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {
UserEntity findByEmailAndPassword(String email, String password);


}
