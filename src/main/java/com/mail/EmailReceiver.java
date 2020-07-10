package com.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(EmailBinding.class)
public class EmailReceiver {

    @Autowired
    private EmailService emailService;

    @StreamListener(target = EmailBinding.emailQueue)
    public void sendEmail(Email email) {
        this.emailService.sendMailToUser(email.getEmail(), email.getMessage(), email.getSubject());
    }
}
