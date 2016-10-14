package com.fun.code;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

import javax.jms.ConnectionFactory;

@Configuration
@EnableJms
public class RouteConfig {

    @Bean(name = "jmsListenerContainerFactory")
    public DefaultJmsListenerContainerFactory createContainerFactory(){
        return new DefaultJmsListenerContainerFactory();
    }

    @Bean(name = "testJMS")
    public JmsComponent getJmsComponent(){
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost?broker.persistent=false");
        return JmsComponent.jmsComponentAutoAcknowledge(connectionFactory);
    }

}