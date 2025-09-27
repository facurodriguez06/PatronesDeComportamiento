package Iterator;

import java.util.List;

public class CursoIterator implements Iterator<Curso>{ //Implementamos el iterador genérico creado
    private List<Curso> cursos;
    private int posicion = 0; //es nuestro indice y nos sirve para saber por donde va el recorrido de la coleccion

    public CursoIterator(List<Curso> cursos){
        this.cursos = cursos;
    }

    @Override
    public Boolean hasNext() {
        return posicion < cursos.size(); //Comparamos si la posiciion actual es menor al tamaño de la lista
    }

    @Override
    public Curso next() {
        return cursos.get(posicion++);//Nos devuelve el curso en la posicion actual e incrementa el indicie
    }
}
