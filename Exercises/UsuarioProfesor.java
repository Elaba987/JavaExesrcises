package Exercises;

public class UsuarioProfesor extends Usuario {

    public UsuarioProfesor(String nombre) {
        super(nombre);
    }

    @Override
    public int limiteDePrestamos() {
        return 10;
    }
}
