package com.brunoharnik.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoharnik.hruser.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
