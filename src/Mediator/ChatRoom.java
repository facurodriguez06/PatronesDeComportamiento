package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    private List<Usuario> usuarios = new ArrayList<>();

    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void enviar(String msg, Usuario usuario){
        for (Usuario u : usuarios)
            if (u != usuario) { //Con esto evitamos que se envíe a si mismo
                u.recibir(msg, usuario);
            }
    }
}
