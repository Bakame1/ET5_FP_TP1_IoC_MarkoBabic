package com.tp;

import com.tp.model.MessageSender;

// classe responsable de l'envoi des SMS
public class SmsSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("SMS : " + message);
    }
}