package com.kslang.demo.modules.word.web;

import com.kslang.demo.domain.Word;
import com.kslang.demo.modules.word.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class WordApi {

    private final WordService wordService;

    @PostMapping("/word/save")
    public Mono<Word> saveWord(String title){
        return wordService.saveWord(title);
    }

    @DeleteMapping("/word/delete/{id}")
    public Mono<String> deleteById(@PathVariable  String id){
        return wordService.deleteById(id);
    }

    @GetMapping("/word/search")
    public Flux<Word> searchWord(String title){
        return wordService.searchWord(title);
    }

}
