package Command;

public class InscribirseCursoCommand implements Command{
    private Alumno alumno;
    private String curso;

    public InscribirseCursoCommand(Alumno alumno, String curso){
        this.alumno = alumno;
        this.curso = curso;
    }

    @Override
    public void execute(){
        alumno.inscribirseCurso(curso);
    }


}
