package com.kslang.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="accounts")
public class Admin {

    @Id
    private String id;

    private String username;

    private String email;

    private String password;
}
