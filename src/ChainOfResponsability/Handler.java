package ChainOfResponsability;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next){
        this.next = next;
    }

    public void handle(SolicitudTutoria s){ //Metodo utilizado en cada clase concreta para decidir quien atiende cada solicitud

    }
}
