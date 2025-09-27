package Command;

public class SistemaCursos {
    private  Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void ejecutarAccion(){
        command.execute();
    }
}
