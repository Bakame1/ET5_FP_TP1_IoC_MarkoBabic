package com.tp;

// classe responsable de la notification des utilisateurs
public class NotificationService {

    // On est lié à EmailSender. Impossible de changer sans modifier le code.
    private EmailSender sender = new EmailSender();

    public void notifyUser(String msg) {
        sender.send(msg);
    }
}