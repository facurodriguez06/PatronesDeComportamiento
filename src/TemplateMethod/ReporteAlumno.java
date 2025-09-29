package TemplateMethod;

public class ReporteAlumno extends ReporteAcademico {
    private final String nombreAlumno;
    private final String legajo;
    private final double promedio;

    public ReporteAlumno(String nombreAlumno, String legajo, double promedio){
        this.nombreAlumno = nombreAlumno;
        this.legajo = legajo;
        this.promedio = promedio;
    }

    @Override
    protected void generarContenido(){ //Generamos el contenido especificamente para un reporte de un alumno
        System.out.println("Alumno: " + nombreAlumno);
        System.out.println("Legajo del alumno: " + legajo);
        System.out.println("Promedio del alumno: " + promedio);
        System.out.println("Observaciones: Rendimiento estable. ");
    }
}
