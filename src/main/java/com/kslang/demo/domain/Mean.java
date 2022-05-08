package com.kslang.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Data
@Document(collection = "means")
public class Mean {
    @Id
    private String id;

    private String description;

    private int pavoriteCount;

}
