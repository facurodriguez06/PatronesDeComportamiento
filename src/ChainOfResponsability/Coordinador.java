package ChainOfResponsability;

public class Coordinador extends Handler {

    @Override
    public void handle(SolicitudTutoria s) {
        // if (s.getNivel() != 1 || s.getNivel() != 2) {
        System.out.println("Coordinador atiende la solicitud de nivel " + s.getNivel()); //El coordinador atiende las solicitudes avanzadas
        //}

    }
}
