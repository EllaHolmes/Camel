package com.fun.code;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    private MyProcessor processor;
    private MyTransformer myTransformer;

    public void configure() throws Exception {
        processor = new MyProcessor();
        myTransformer = new MyTransformer();

        from("testJMS:queue:test.queue")
                .to("file://test");

        from("testJMS:queue:test.queue")
                .process(processor)
                .bean(myTransformer, "transformContent")
                .to("file://test/output");

    }

}