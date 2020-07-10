package com.mail;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface EmailBinding {

    String emailQueue = "email-queue";

    @Input(emailQueue)
    SubscribableChannel sendMail();
}
