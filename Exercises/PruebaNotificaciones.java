package Exercises;

import java.util.ArrayList;
import java.util.List;

public class PruebaNotificaciones {

    public static void main(String[] args) {
        List<Notificacion> notificaciones = new ArrayList<Notificacion>();
        notificaciones.add(new NotificacionCorreo("alguien@example.com"));
        notificaciones.add(new NotificacionConsola());

        for (Notificacion n : notificaciones) {
            n.enviar("Hola, esto es una prueba de polimorfismo");
        }
    }
}
