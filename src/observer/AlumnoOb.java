package observer;

public class AlumnoOb implements IObserver{
    private final String nombre;

    public AlumnoOb(String nombre){
        this.nombre = nombre;
    }



    @Override
    public void update(String msg) {
        System.out.println("[ " + nombre + " ] Notificación: " + msg);
    }
}
