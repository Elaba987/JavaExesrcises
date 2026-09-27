package Exercises;

public class Libro {

    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public boolean estaPrestado() {
        return this.prestado;
    }

    void marcarPrestado(boolean valor) {
        this.prestado = valor;
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" de " + autor + (prestado ? " (prestado)" : " (disponible)");
    }
}
