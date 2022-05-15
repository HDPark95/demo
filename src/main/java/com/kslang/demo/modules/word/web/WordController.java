package com.kslang.demo.modules.word.web;

import com.kslang.demo.domain.Word;
import com.kslang.demo.modules.word.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RequiredArgsConstructor
@RestController
public class WordController {

    private final WordService wordService;

    @GetMapping
    Flux<String> main(){
        return Flux.just("Hello", "World");
    }

    @PostMapping("/word/save")
    public Mono<Word> saveWord(Word word){
        return wordService.saveWord(word);
    }

    @DeleteMapping("/word/delete/{id}")
    public Mono<String> deleteById(@PathVariable  String id){
        return wordService.deleteById(id);
    }


}
