package com.avengers.luadingo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.avengers.luadingo.model.User;

import java.util.*;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    // @Query("SELECT * FROM user")
    // User getAll();

    // @Query("SELECT * FROM User u WHERE u.username = ?1")
    // User get(String username);

    // @Modifying
    // @Query("INSERT INTO User (username, password, email, level) VALUES
    // (:username, :password, :email, :level)")
    // int add(@Param("username") String username, @Param("password") String
    // password, @Param("email") String email,
    // @Param("level") int level);

    // @Modifying
    // @Query("DELETE FROM User u WHERE u.username = :username")
    // int delete(@Param("username") String username);

    // @Modifying
    // @Query("UPDATE User u SET u.password = :password, u.email = :email, u.level =
    // :level WHERE u.username = :username")
    // int update(@Param("password") String password, @Param("email") String email,
    // @Param("level") int level,
    // @Param("username") String username);

}