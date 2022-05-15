package com.kslang.demo.modules.word.web;

import com.kslang.demo.domain.Word;
import com.kslang.demo.modules.word.service.WordRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.times;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@WebFluxTest
//@SpringBootTest
class WordControllerTest {

    @MockBean
    WordRepository wordRepository;

    @Autowired
    private WebTestClient webTestClient; //비동기로 http 요청

    @Test
    void main() {

    }

    @Test
    void saveWord() {
        Word word = new Word();
        word.setId("123");
        word.setTitle("Test");
        word.setReportCd(false);

        Mockito.when(wordRepository.saveWord(word)).thenReturn(Mono.just(word));
        webTestClient.post()
                .uri("/word/save")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromObject(word))
                .exchange()
                .expectStatus().isCreated();

        Mockito.verify(wordRepository, times(1)).save(word);

    }

    @Test
    void deleteWord() {
        Mono<Void> voidReturn = Mono.empty();
        Mockito.when(wordRepository.deleteWordById("123"))
                .thenReturn(voidReturn);
        webTestClient.delete().uri("/word/delete/{idx}", "123")
                .exchange()
                .expectStatus().isOk();
    }
}