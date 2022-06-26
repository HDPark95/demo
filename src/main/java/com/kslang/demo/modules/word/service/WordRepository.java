package com.kslang.demo.modules.word.service;

import com.kslang.demo.domain.Word;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface WordRepository extends ReactiveMongoRepository<Word, String> {
    Flux<Word> findByTitle(String title);

    Mono<Word> save(Word word);

    Mono<Void> deleteWordById(String id);

    Mono<Word> findById(String id);
}
