package com.tp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //On charge le conteneur Spring à partir du XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //On demande le bean notificationService
        NotificationService service = context.getBean(NotificationService.class);

        //On l'utilise
        service.notifyUser("Bonjour Spring !");
    }
}