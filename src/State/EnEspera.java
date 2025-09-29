package State;

public class EnEspera implements EstadoInscripcion{
    @Override
    public void cambiarEstado(Inscripcion inscripcion) {
        System.out.println("La inscripcion del alumno pasa de EN ESPERA -> INSCRITO");
        inscripcion.setEstadoInscripcion(new Inscrito()); //Pasa del estado "EN ESPERA" al estado "INSCRITO"
    }

    @Override
    public String getNombre() {
        return "EN ESPERA";
    }
}
