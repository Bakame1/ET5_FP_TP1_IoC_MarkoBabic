package com.tp;

import com.tp.model.MessageSender;

// classe responsable de la notification des utilisateurs
public class NotificationService {

    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }
    public void notifyUser(String msg) {
        sender.send(msg);
    }

}