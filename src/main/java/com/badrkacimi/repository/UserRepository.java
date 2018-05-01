package com.badrkacimi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.badrkacimi.model.Users;

public interface UserRepository extends JpaRepository <Users, Integer> {
}
