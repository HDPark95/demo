package com.kslang.demo.modules.word.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class WordController {

    @GetMapping
    Flux<String> main(){
        return Flux.just("Hello", "World");
    }

}
