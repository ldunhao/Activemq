package com.lucas.activemqdemo.consumer.component;

import com.lucas.activemqdemo.model.SystemMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    public static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "activemqdemo-queue")
    public void messageListener(SystemMessage systemMessage){
        LOGGER.info("Message received {}", systemMessage);
    }
}
