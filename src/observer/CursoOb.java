package observer;

import java.util.ArrayList;
import java.util.List;

public class CursoOb {
    private final String nombre;
    private final List<IObserver> observadores = new ArrayList<>();
    private String horario;

    public CursoOb(String nombre, String horarioInicial){
        this.nombre = nombre;
        horario = horarioInicial;
    }

    public void suscribrir(IObserver o){
        if(o != null && !observadores.contains(o)) {
            observadores.add(o);
        }
    }

    public void desuscribir(IObserver o){
        observadores.remove(o);
    }

    //Notificamos el caambio
    public void notificar(String msg){
        for (IObserver o: observadores){
            o.update("Curso " + nombre + ": " + msg);
        }
    }

    //Cambiso que van a disparar notificaciones
    public void actualizarHorario(String nuevoHorario){
        String anterior = this.horario;
        this.horario = nuevoHorario;
        notificar("Cambio de horario de " + anterior + " a " + nuevoHorario);
    }

    //Publicamos el aviso sobre el cambio
    public void publicarAviso(String aviso){
        notificar("Nuevo aviso - " + aviso);
    }

}
