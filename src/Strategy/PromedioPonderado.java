package Strategy;

import java.util.List;

public class PromedioPonderado implements CalculoNota {
    private final List<Integer> pesos;

    public PromedioPonderado(List<Integer> pesos) {
        this.pesos = pesos;
    }

    @Override
    public double calcular(List<Integer> notas) {
        if (notas.isEmpty() || notas.size() != pesos.size()) return 0;
        int suma = 0;
        int sumaPesos = 0;
        for(int i = 0; i< notas.size(); i++){
            suma += notas.get(i) * pesos.get(i);
            sumaPesos += pesos.get(i);
        }
        return (double) suma / sumaPesos; //Devuelce el promedio ponderado, es decir cada nota tiene un peso distinto
    }

}
