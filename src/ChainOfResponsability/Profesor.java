package ChainOfResponsability;

public class Profesor extends Handler{
    @Override
    public void handle(SolicitudTutoria s){
        if(s.getNivel() == 2){ //El profesor aatiende las solicitudes de nivel intermedio
            System.out.println("Profesor atiende la solicitud de nivel " + s.getNivel());
        } else if (next != null){
            next.handle(s);
        }
    }
}
