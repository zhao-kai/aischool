package com.chenglian.aischool.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chenglian.aischool.security.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(final String username);
}
