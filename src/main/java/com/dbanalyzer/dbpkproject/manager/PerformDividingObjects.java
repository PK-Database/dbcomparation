package com.dbanalyzer.dbpkproject.manager;

import com.google.common.collect.UnmodifiableIterator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@AllArgsConstructor
@Slf4j
public class PerformDividingObjects <T> extends Thread{

    private List<T> unmodifiableIteratorElement;

    @Override
    public void run(){
        unmodifiableIteratorElement.forEach(el -> log.info(unmodifiableIteratorElement.toString()));
    }
}
