package com.tp;

import com.tp.model.MessageSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// classe responsable de la notification des utilisateurs
@Service
public class NotificationService {

    private MessageSender sender;

    @Autowired // Spring cherche un bean qui correspond à MessageSender et l'injecte
    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    // Injection par Setter : Spring appellera cette méthode après la création de l'objet
    public void notifyUser(String msg) {
        sender.send(msg);
    }
}