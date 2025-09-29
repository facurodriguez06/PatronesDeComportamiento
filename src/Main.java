import ChainOfResponsability.*;
import Command.*;
import Iterator.*;
import Memento.*;
import observer.*;




public class Main {
    public static void main(String[] args) {
        // Chains Of Responsability
        System.out.println("=======CHAINS OF RESPONSABILITY =======");
        System.out.println("");

        //Creamos los handlers
        Handler asistente = new Asistente();
        Handler profesor = new Profesor();
        Handler coordinador = new Coordinador();

        //Realizamos cadena del ejercicio: Asistente -> Profesor -> Coordinador
        asistente.setNext(profesor);
        profesor.setNext(coordinador);

        asistente.handle(new SolicitudTutoria(1)); //La atiende el asistente
        asistente.handle(new SolicitudTutoria(2)); //La atiende el profesor
        asistente.handle(new SolicitudTutoria(3)); //La atiende el coordinador
        System.out.println("");

        System.out.println("\n======= COMMAND =======");
        System.out.println("");

        //Creamos los alumnos
        Alumno alumno1 = new Alumno("Facundo Rodriguez");
        Alumno alumno2 = new Alumno("Nicolas Días");
        Alumno alumno3 = new Alumno("Lautaro Sosa");

        Command inscribirse = new InscribirseCursoCommand(alumno1, "Desarrrollo de Software");
        Command abandonar = new AbandonarCursoCommand(alumno2, "Desarrollo de Software");
        Command certificado = new SolicitarCertificadoCommand(alumno3, "Análisis Numérico");

        //Creamos el sistema
        SistemaCursos sistema = new SistemaCursos();

        //Inscribirse
        sistema.setCommand(inscribirse);
        sistema.ejecutarAccion();

        //Abandonar
        sistema.setCommand(abandonar);
        sistema.ejecutarAccion();

        //Solicitar certificado
        sistema.setCommand(certificado);
        sistema.ejecutarAccion();
        System.out.println("");

        // Iterator
        System.out.println("=======ITERATOR=======");
        System.out.println("");
        //Creamos el alumno
        AlumnoIt alumno_1 = new AlumnoIt("Lautaro", 51107);
        //Lo inscribimos a cursos
        alumno_1.inscribirCurso(new Curso("Analisis Numerico"));
        alumno_1.inscribirCurso(new Curso("Desarrollo de Software"));

        //Recorremos la lista de cursos del alumno
        CursoIterator it = alumno_1.getIterator();
        System.out.println("Cursos de " + alumno_1.getNombre() + ":");
        while (it.hasNext()){
            Curso c = it.next();
            System.out.println("- " + c.getNombre());
        }

        System.out.println("");

        // Mediator
        System.out.println("=======MEDIATOR=======");
        System.out.println("");




        System.out.println("");

        //Memento
        System.out.println("=======MEMENTO=======");
        System.out.println("");

        //Creamos un examen
        Examen examenDesarrollo = new Examen();
        Historial historial = new Historial();

        //Regsitramos respuesta y guardamos la mismas en el historial
        examenDesarrollo.responder("La respuesta es la opcion b");
        historial.guardar(examenDesarrollo.save());

        examenDesarrollo.responder("Lo realizamos usando el patrón Singleton");
        historial.guardar(examenDesarrollo.save());

        //Mostramos las respuestas del examen
        examenDesarrollo.mostrarRespuestas();

        //Suponemos que el alumno responde más, pero quiere volver hacia atrás
        examenDesarrollo.responder("Opcion A");
        examenDesarrollo.mostrarRespuestas();

        //Restauramos desde el memento
        examenDesarrollo.restore(historial.recuperarMemento());
        examenDesarrollo.mostrarRespuestas();

        System.out.println("");

        //Observer
        System.out.println("=======OBSERVER=======");
        System.out.println("");

        //Creamos un curso
        CursoOb disenio = new CursoOb("Diseño de Sistemas", "Jueves 19:00");

        //Creamos a tres alumnos
        AlumnoOb ale = new AlumnoOb("Alejandro Cortés");
        AlumnoOb franco = new AlumnoOb("Franco Siccatto");
        AlumnoOb facu = new AlumnoOb("Facundo Rodriguez");

        //Lo sucribimos a uno y desucribimos a otro
        disenio.suscribrir(franco);
        disenio.desuscribir(ale);
        disenio.suscribrir(facu);

        //Publicamos un aviso y actualizamos la hora
        disenio.publicarAviso("Este jueves arrancamos el eje de secuencia");
        disenio.actualizarHorario("Jueves 20:30");

        disenio.desuscribir(franco);
        disenio.publicarAviso("Se habilitó material extra en el campus");

    }
}