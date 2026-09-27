package Exercises;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public boolean prestar(Usuario usuario, Libro libro) {
        if (libro.estaPrestado() || !usuario.puedePedirPrestado()) {
            return false;
        }
        libro.marcarPrestado(true);
        usuario.registrarPrestamo();
        return true;
    }

    public boolean devolver(Usuario usuario, Libro libro) {
        if (!libro.estaPrestado()) {
            return false;
        }
        libro.marcarPrestado(false);
        usuario.registrarDevolucion();
        return true;
    }
}
