package Visitor;

public class AlumnoRegular extends AlumnoV{
    public AlumnoRegular(String nombre, double cuota){
        super(nombre, cuota);
    }

    @Override
    public void aceptar(Visitor v){
        v.visitar(this);
    }
}
