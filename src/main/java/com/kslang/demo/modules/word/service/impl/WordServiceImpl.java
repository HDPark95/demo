package com.kslang.demo.modules.word.service.impl;

import com.kslang.demo.domain.Word;
import com.kslang.demo.modules.word.service.WordRepository;
import com.kslang.demo.modules.word.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class WordServiceImpl implements WordService {

    private final WordRepository wordRepository;

    public Flux<Word> searchWord(String title){
        Flux<Word> word = (Flux<Word>) wordRepository.findByTitle(title);
        return word;
    }
}
