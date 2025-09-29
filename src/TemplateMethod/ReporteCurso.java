package TemplateMethod;

public class ReporteCurso extends ReporteAcademico{
    private final String nombreCurso;
    private final double promedio;
    private final int inscriptos;

    public ReporteCurso(String nombreCurso, double promedio, int inscriptos){
        this.nombreCurso = nombreCurso;
        this.promedio = promedio;
        this.inscriptos = inscriptos;
    }

    @Override
    protected void generarContenido(){ //El contenido lo generamos dependiendo de cada clase, en este caso será un reporte del curso
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Promedio General: " + promedio);
        System.out.println("Inscriptos: " + inscriptos);
    }
}
