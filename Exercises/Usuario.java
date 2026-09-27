package Exercises;

public abstract class Usuario {

    protected String nombre;
    private int librosPrestados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getLibrosPrestados() {
        return this.librosPrestados;
    }

    void registrarPrestamo() {
        this.librosPrestados++;
    }

    void registrarDevolucion() {
        if (this.librosPrestados > 0) {
            this.librosPrestados--;
        }
    }

    public abstract int limiteDePrestamos();

    public boolean puedePedirPrestado() {
        return this.librosPrestados < limiteDePrestamos();
    }
}
