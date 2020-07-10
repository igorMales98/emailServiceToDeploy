package com.mail;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
@Component
public class MQReceiver {

    @Autowired
    private EmailService emailService;

    @RabbitListener(queues = MQConfig.emailQueue)
    public void receiveMessage(Email email) {
        try {
            emailService.sendMailToUser(email.getEmail(), email.getMessage(), email.getSubject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/
