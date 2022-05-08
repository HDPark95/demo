package com.kslang.demo.Runner;

import com.kslang.demo.domain.Admin;
import com.kslang.demo.modules.admin.service.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Admin admin = new Admin();
        admin.setEmail("admin@kslang.com");
        admin.setUsername("admin");
        admin.setPassword("123");
        adminRepository.insert(admin);
    }
}
