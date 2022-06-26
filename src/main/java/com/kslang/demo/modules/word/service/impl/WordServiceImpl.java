package com.kslang.demo.modules.word.service.impl;

import com.kslang.demo.domain.Word;
import com.kslang.demo.modules.word.service.WordRepository;
import com.kslang.demo.modules.word.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    WordRepository wordRepository;

    @Override
    public Flux<Word> searchWord(String title){
        Flux<Word> word = (Flux<Word>) wordRepository.findByTitle(title);
        return word;
    }

    @Override
    public Mono<Word> saveWord(Word word) {
        return null;
    }

    @Override
    public Mono<Word> saveWord(String title){
        Word word = new Word(title, false);
        return wordRepository.save(word);
    }

    @Override
    public Mono<String> deleteById(String id){
        //wordRepository.deleteWordById(id);
        //return Mono.just("Word :" +id+" 제거되었습니다!");
        return null;
    }
}
