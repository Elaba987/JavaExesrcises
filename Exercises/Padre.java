package Exercises;

public class Padre {
    String apellido;

    public Padre(String apellido){
        this.apellido = apellido;
    }

    public Boolean test(){
        Hijo hijo = new Hijo("Juan", this.apellido);
        EspirituSanto espirituSanto = new EspirituSanto(hijo.nombre, this.apellido, "Lopez");
        return espirituSanto.pruebaPaternidad();
    }

}