package com.kslang.demo.modules.word.service;

import com.kslang.demo.domain.Word;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WordRepository extends MongoRepository<Word, String> {
    List<Word> findByTitle(String title);
}
