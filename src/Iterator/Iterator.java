package Iterator;

    public interface Iterator<T> {  //Usaremos esta Interface como un iterador generico al cual implementaremos en la clase CursoIterator
    public  Boolean hasNext(); //Devuelve true si aún hay elementos por reccorrer
    T next(); //Con este metodo vamos a obtener el siguiente elemento de la coleccion
}
