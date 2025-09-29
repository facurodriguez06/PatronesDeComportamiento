package Visitor;

public class AplicarBeca implements Visitor{
    @Override
    public void visitar(AlumnoRegular a) {
        double nuevaCuota = a.getCuota() * 0.9; //10% de descuento
        System.out.println(a.getNombre() + " (Regular) -> Cuota Original: " + a.getCuota() + " -> con beneficio: " + nuevaCuota);
    }

    @Override
    public void visitar(AlumnoBecado a) {
        double becaExtra = 0.3; //30% adicional sobre la cuota
        double descuentoTotal = a.getPorcentajeBeca() + becaExtra;
        if(descuentoTotal > 1) descuentoTotal = 1; //No más del 100%
        double nuevaCuota = a.getCuota() * (1 - descuentoTotal);
        System.out.println(a.getNombre() + " (Becado) -> Cuota original: " + a.getCuota() + " -> con " + (descuentoTotal * 100) + "% de beca total: " + nuevaCuota);


    }
}
