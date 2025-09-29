package Strategy;

import java.util.List;

public class PromedioSimple implements CalculoNota{

    @Override
    public double calcular(List<Integer> notas) {
        if(notas.isEmpty()) return 0;
        int suma = 0;
        for(int n:notas){
            suma += n;
        }
        return (double) suma / notas.size(); //Devuelve el promedio de las notas
    }
}
