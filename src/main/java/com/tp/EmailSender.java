package com.tp;

import com.tp.model.MessageSender;

// classe responsable de l'envoi des emails
public class EmailSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Email : " + message);
    }
}