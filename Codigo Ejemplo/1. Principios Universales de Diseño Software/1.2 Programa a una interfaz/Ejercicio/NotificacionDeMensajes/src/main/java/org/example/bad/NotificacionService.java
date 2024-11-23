package org.example.bad;

public class NotificacionService {

    public void sendNotification(EmailNotificationChannel chanel, String message) {

            chanel.send(message);
    }

}
