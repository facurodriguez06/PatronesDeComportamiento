package Visitor;

public abstract class AlumnoV {
    protected String nombre;
    protected double cuota; //Cuota mensual

    public AlumnoV(String nombre, double cuota){
        this.nombre = nombre;
        this.cuota = cuota;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCuota() {
        return cuota;
    }


    public abstract void aceptar(Visitor v);
}
