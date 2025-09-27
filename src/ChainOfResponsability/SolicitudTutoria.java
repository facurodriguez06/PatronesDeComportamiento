package ChainOfResponsability;

public class SolicitudTutoria {
    public int nivel;  //Vamos a manejar cada solicitud por niveles de complejidad -> Nivel 1: NIVEL SIMPLE ; Nivel 2: NIVEL INTERMEDIO; Nivel 3+: NIVEL AVANZADO

    public SolicitudTutoria(int nivel){
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

}
