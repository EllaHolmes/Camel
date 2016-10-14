package com.fun.code;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        System.out.println("Now Processing the String :" + exchange.getIn().getBody().toString());
    }
}
