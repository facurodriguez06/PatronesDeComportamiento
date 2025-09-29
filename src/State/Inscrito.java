package State;

public class Inscrito implements EstadoInscripcion{


    @Override
    public void cambiarEstado(Inscripcion inscripcion) {
        System.out.println("La inscripcion del alumno pasa de INSCRITO -> CANCELADO");
        inscripcion.setEstadoInscripcion(new Cancelado()); //Pasa del estado "INSCRITO" al estado "CANCELADO"
    }

    @Override
    public String getNombre() {
        return "INSCRITO";
    }
}
