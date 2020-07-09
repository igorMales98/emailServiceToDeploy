package com.mail;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQReceiver {

    @RabbitListener(queues = MQConfig.emailQueue)
    public void receiveMessage(String message) {
        System.out.println("Usao je u receiver u ovom servisu. i poruka je " + message);
    }
}
