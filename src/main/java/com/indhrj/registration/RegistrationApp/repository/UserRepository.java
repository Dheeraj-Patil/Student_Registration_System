package com.indhrj.registration.RegistrationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indhrj.registration.RegistrationApp.entity.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer> {

}
