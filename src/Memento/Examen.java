package Memento;

import java.util.ArrayList;
import java.util.List;

public class Examen {
    private List<String> respuestas = new ArrayList<>();

    public void responder(String respuesta){
        respuestas.add(respuesta);
    }
    public void mostrarRespuestas(){
        System.out.println("Respuestas hasta el moemnto: " + respuestas);
    }

    //Ahora guardamos el estado del examen haciendo uso de Memento

    public Memento save(){
        return new Memento(respuestas);
    }

    public void restore(Memento m) {
        if (m == null) {
            throw new IllegalStateException("No hay memento para restaurar (historial vacío o nulo).");
        }
        respuestas = new ArrayList<>(m.getRespuestas());
    }



}
