package State;

public class Inscripcion {
    private EstadoInscripcion estadoInscripcion;

    public Inscripcion(EstadoInscripcion estadoInscripcion) {
        this.estadoInscripcion = estadoInscripcion;
    }

    public void setEstadoInscripcion(EstadoInscripcion nuevo){
        this.estadoInscripcion = nuevo;
    }

    public void cambiarEstado() {
        estadoInscripcion.cambiarEstado(this);
    }

    public void mostrarEstado(){
        System.out.println("Estado actual de la inscripcion: " + estadoInscripcion.getNombre());
    }
}
