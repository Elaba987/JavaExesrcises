package Exercises;

public class Motocicleta extends Vehiculo {

    private int cilindraje;

    public Motocicleta(String marca, String modelo, int cilindraje) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Cilindraje: " + this.cilindraje + "cc";
    }
}
