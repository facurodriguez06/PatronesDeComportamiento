package Visitor;

public class AlumnoBecado extends AlumnoV{
    private double porcentajeBeca; //% de beca que ya tieen

    public AlumnoBecado(String nombre, double cuota, double PorcentajeBeca){
        super(nombre, cuota);
        this.porcentajeBeca = porcentajeBeca;
    }

    public double getPorcentajeBeca() {
        return porcentajeBeca;
    }

    @Override
    public void aceptar(Visitor v){
        v.visitar(this);
    }
}
