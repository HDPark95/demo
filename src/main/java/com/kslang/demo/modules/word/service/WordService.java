package com.kslang.demo.modules.word.service;

import com.kslang.demo.domain.Word;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WordService {

    Flux<Word> searchWord(String title);

    Mono<Word> saveWord(Word word);

    Mono<String> deleteById(String id);


}
