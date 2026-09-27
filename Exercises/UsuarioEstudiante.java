package Exercises;

public class UsuarioEstudiante extends Usuario {

    public UsuarioEstudiante(String nombre) {
        super(nombre);
    }

    @Override
    public int limiteDePrestamos() {
        return 3;
    }
}
