package Strategy;

import java.util.List;

public class ExamenExtra implements CalculoNota{ //Consideramos un examen extra, por ejemplo un recuperatorio
    private final int examenExtra;

    public ExamenExtra(int examenExtra){
        this.examenExtra = examenExtra;
    }


    @Override
    public double calcular(List<Integer> notas) {
        if(notas.isEmpty()) return examenExtra;
        int suma = 0;
        for (int n:notas){
            suma += n;
        }
        double promedio = (double) suma/ notas.size(); //Es el promedio, pero si el examen extra es mayor, se reemplaza

        return Math.max(promedio, examenExtra);
    }
}
