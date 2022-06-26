package com.kslang.demo.modules.word.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller
public class WordController {
    @GetMapping("/")
    public Mono<String> main(){
        return Mono.just("main");
    }
    @GetMapping("/layout")
    public Mono<String> layout(){
        return Mono.just("/layouts/layout");
    }
    @GetMapping("/page/word/form")
    public Mono<String> goWordForm(){
        return Mono.just("/word/form");
    }

}
