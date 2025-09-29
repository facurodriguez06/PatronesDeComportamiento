package State;

public class Cancelado implements EstadoInscripcion{

    @Override
    public void cambiarEstado(Inscripcion inscripcion) {
        System.out.println("La inscripcion del alumno está cancelada, no puede volver a inscribirse"); //Este es el útlimo estado, por este motivo no pasa a otro
    }

    @Override
    public String getNombre() {
        return "CANCELADO";
    }
}
