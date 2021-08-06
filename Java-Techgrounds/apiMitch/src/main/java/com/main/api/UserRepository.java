package com.main.api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Student, Long> {

    String toegevoegd = "";
}