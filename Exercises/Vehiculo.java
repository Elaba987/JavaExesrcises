package Exercises;

public class Vehiculo {

    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String mostrarInformacion() {
        return "Marca: " + this.marca + ", Modelo: " + this.modelo;
    }
}
