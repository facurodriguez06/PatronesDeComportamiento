package Iterator;

import java.util.ArrayList;
import java.util.List;

public class AlumnoIt {
    private String nombre;
    private int legajo;
    private List<Curso> cursos = new ArrayList<>();

    public AlumnoIt(String nombre, int legajo){
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public void inscribirCurso(Curso c){
        cursos.add(c); //Agregamos cursos en la lista
    }

public CursoIterator getIterator(){
        return new CursoIterator(cursos); // devuelve un iterador sobre la lista de curso en lugar de exponer laa lista directamente
}

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }
}
