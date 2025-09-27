package Mediator;

public abstract class Usuario {
    protected ChatMediator mediator;
    protected String nombre;

    public Usuario(ChatMediator mediator, String nombre){
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public abstract  void enviar(String msg);
    public abstract void recibir(String msg);
}
