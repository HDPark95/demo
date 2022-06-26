package com.kslang.demo.modules.word.web;

import com.kslang.demo.domain.Word;
import com.kslang.demo.modules.word.service.WordRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.Mockito.times;

@ExtendWith(SpringExtension.class)
@WebFluxTest(WordApi.class)
class WordApiTest {

    @Autowired
    private WebTestClient webTestClient; //비동기로 http 요청

    @Autowired
    private WordRepository wordRepository;

    @Test
    void saveWord() {
        String title = "";
        Word word = new Word(title, false);
        Mono<Word> savedWord = wordRepository.save(word);
//        StepVerifier.create(ordRepository.findById())
//                .assertNext(word -> {
//
//                })
//                .verifyComplete();
    }

    @Test
    void deleteById() {
    }

    @Test
    void searchWord() {
    }
}