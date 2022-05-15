package com.kslang.demo.Runner;

import com.kslang.demo.domain.User;
import com.kslang.demo.modules.user.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    UserRepository adminRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        User admin = new User();
        admin.setEmail("admin@kslang.com");
        admin.setUsername("admin");
        admin.setPassword("123");
        adminRepository.insert(admin);
    }
}
