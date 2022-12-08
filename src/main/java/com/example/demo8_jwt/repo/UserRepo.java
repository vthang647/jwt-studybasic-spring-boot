package com.example.demo8_jwt.repo;

import com.example.demo8_jwt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    @Query(value = "select * from user where username like :username", nativeQuery = true)
    User findByUserName(@Param("username") String username);
}
