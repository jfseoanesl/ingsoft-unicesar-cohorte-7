package org.example.bad;

/*
    Un sistema de notificaciones envía mensajes a los usuarios por diferentes medios.
    Actualmente, el sistema solo permite el envio d emensajes por correo electronico.
    Se desea permitir que tambien envie mensajes por otros canales como: SMS y notificaciones push, ws.

    Problemas:
    * Acoplamiento fuerte
    * Dificultad para extender
 */
public class Main {
    public static void main(String[] args) {

        NotificacionService service = new NotificacionService();
        EmailNotificationChannel channel = new EmailNotificationChannel();
        service.sendNotification(channel, "Programa a una interfaz, no a implementaciones");

    }
}