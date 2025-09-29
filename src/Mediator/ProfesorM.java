package Mediator;

public class ProfesorM extends Usuario{
    public ProfesorM(ChatMediator mediator, String nombre){
        super(mediator, nombre);
    }

    @Override
    public void enviar(String msg) {
        System.out.println(nombre + " (Profesor) envía: " + msg);
        mediator.enviar(msg, this);
    }

    @Override
    public void recibir(String msg, Usuario remitente) {
        System.out.println(nombre + " (Profesor) recibe de " + remitente.getNombre() + ": " + msg);
    }

}
