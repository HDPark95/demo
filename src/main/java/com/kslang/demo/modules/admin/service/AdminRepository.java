package com.kslang.demo.modules.admin.service;

import com.kslang.demo.domain.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AdminRepository extends MongoRepository<Admin, String> {

    Optional<Admin> findByEmail(String email);
}
