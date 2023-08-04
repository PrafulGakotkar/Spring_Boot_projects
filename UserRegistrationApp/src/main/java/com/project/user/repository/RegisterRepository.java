package com.project.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.user.entity.Register;

public interface RegisterRepository extends JpaRepository<Register, Integer> {

}
