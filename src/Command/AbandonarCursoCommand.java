package Command;

public class AbandonarCursoCommand implements Command{
    private Alumno alumno;
    private String curso;

    public AbandonarCursoCommand(Alumno alumno, String curso){
        this.alumno = alumno;
        this.curso = curso;
    }

    @Override
    public void execute(){
        alumno.abandonarCurso(curso);
    }

}
