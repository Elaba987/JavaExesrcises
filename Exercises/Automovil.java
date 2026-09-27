package Exercises;

public class Automovil extends Vehiculo {

    private int numeroPuertas;

    public Automovil(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Puertas: " + this.numeroPuertas;
    }
}
