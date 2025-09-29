package Strategy;

import java.util.List;

public class AlumnoSt {
    private final String nombre;
    private final List<Integer> notas;
    private CalculoNota estrategia;

    public AlumnoSt(String nombre, List<Integer>notas){
        this.nombre = nombre;
        this.notas = notas;
    }

    public void setEstrategia(CalculoNota estrategia) {
        this.estrategia = estrategia;
    }
    public void calcularNotaFinal(){
        if(estrategia == null) {
            System.out.println("No se definió estrategia de cálculo");
            return;
        }
        double notaFinal = estrategia.calcular(notas);
        System.out.println("Alumno " + nombre + " -> Nota Final: " + notaFinal);
        }
    }

