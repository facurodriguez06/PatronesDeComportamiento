package Memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Historial {
    private final Deque<Memento> pila = new ArrayDeque<>();

    public void guardar(Memento m) {
        if (m == null) {
            throw new IllegalArgumentException("No se puede guardar un memento nulo.");
        }
        pila.push(m);
    }

    public Memento recuperarMemento() {
        if (pila.isEmpty()) {
            throw new IllegalStateException("Historial vacío: no hay estados para recuperar.");
        }
        return pila.pop();
    }
}
