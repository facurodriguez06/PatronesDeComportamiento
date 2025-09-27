package Command;

public class Alumno {
    private  String nombre;

    public Alumno(String nombre){
        this.nombre = nombre;
    }

    public void inscribirseCurso(String curso){
        System.out.println(nombre + " se inscribió al curso: " + curso);
    }

    public void abandonarCurso(String curso){
        System.out.println(nombre + " abandonó el curso: " + curso);
    }

    public  void solicitarCertificado(String curso){
        System.out.println(nombre + " solicitó el certificado del curso: " + curso);
    }

}
