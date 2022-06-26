package com.kslang.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection ="word")
public class Word {
    @Id
    private String id;

    private String title;

    private boolean reportCd;

    public Word(String title, boolean reportCd) {
        this.title = title;
        this.reportCd = reportCd;
    }
}
