package Exercises;

public class NotificacionCorreo implements Notificacion {

    private String correoDestino;

    public NotificacionCorreo(String correoDestino) {
        this.correoDestino = correoDestino;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo a " + this.correoDestino + ": " + mensaje);
    }
}
