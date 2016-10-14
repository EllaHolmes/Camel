package com.fun.code.services;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    private ProducerTemplate producerTemplate;

    @Autowired
    public MathService(ProducerTemplate producerTemplate) {
        this.producerTemplate = producerTemplate;
    }

    public void add() {
        producerTemplate.sendBody("testJMS:queue:test.queue", "Test Message: Hello");
    }

}
