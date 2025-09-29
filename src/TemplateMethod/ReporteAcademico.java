package TemplateMethod;

import java.time.LocalDate;

public abstract class ReporteAcademico {
    public final void generarReporte() {
        generarEncabezado();
        generarContenido();
        generarPie();
    }

    protected void generarEncabezado(){
        System.out.println("=== REPORTE ACADÉMICO ===");
        System.out.println("Fecha: " + LocalDate.now());
    }

    protected void generarContenido(){} //En cada subclase vamos a definir el contenido

    protected void generarPie(){
        System.out.println("--- Fin del Reporte ---");
    }

}
