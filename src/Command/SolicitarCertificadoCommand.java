package Command;

public class SolicitarCertificadoCommand implements Command{
    private Alumno alumno;
    private String curso;

    public SolicitarCertificadoCommand(Alumno alumno, String curso){
        this.alumno = alumno;
        this.curso = curso;
    }

    @Override
    public void execute(){
        alumno.solicitarCertificado(curso);
    }
}
