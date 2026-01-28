package com.tp;

import com.tp.model.MessageSender;

import org.springframework.stereotype.Component;

// classe responsable de l'envoi des emails
@Component
public class EmailSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Email : " + message);
    }
}