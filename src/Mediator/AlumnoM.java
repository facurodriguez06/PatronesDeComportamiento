package Mediator;

public class AlumnoM extends Usuario{
    public AlumnoM(ChatMediator mediator, String nombre){
        super(mediator, nombre);
    }
    @Override
    public void enviar(String msg){
        System.out.println(nombre + " (Alumno) envía: " + msg);
        mediator.enviar(msg,this);
    }

    @Override
    public void recibir(String msg, Usuario remitente) {
        System.out.println(nombre + " (Alumno) recibe de " + remitente.getNombre() + ": " + msg);
    }
}
