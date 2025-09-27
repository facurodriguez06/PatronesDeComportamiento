package ChainOfResponsability;

public class Asistente extends Handler {

    @Override
    public void handle(SolicitudTutoria s) {
        if (s.getNivel() == 1) { //El asistente atiende las consultas de nivel simple
            System.out.println("Asistente atiende la solicitud de nivel " + s.getNivel());
        } else if (next != null) {
            next.handle(s);
        }
    }
}
