import ChainOfResponsability.*;
import Command.*;
import Iterator.*;
import Memento.*;
import State.EnEspera;
import State.Inscripcion;
import Strategy.AlumnoSt;
import Strategy.ExamenExtra;
import Strategy.PromedioPonderado;
import Strategy.PromedioSimple;
import TemplateMethod.ReporteAcademico;
import TemplateMethod.ReporteAlumno;
import TemplateMethod.ReporteCurso;
import Visitor.*;
import observer.*;
import State.*;

import java.util.Arrays;


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

        //Lo sucribimos a uno y desuscribimos a otro
        disenio.suscribrir(franco);
        disenio.desuscribir(ale);
        disenio.suscribrir(facu);

        //Publicamos un aviso y actualizamos la hora
        disenio.publicarAviso("Este jueves arrancamos el eje de secuencia");
        disenio.actualizarHorario("Jueves 20:30");

        disenio.desuscribir(franco);
        disenio.publicarAviso("Se habilitó material extra en el campus");

        System.out.println("");

        //State
        System.out.println("=======STATE=======");
        System.out.println("");

        //Creamos inscripciones
        Inscripcion inscripcion1 = new Inscripcion(new EnEspera());

        inscripcion1.mostrarEstado(); //Mostramos el estado inicial

        //Primer cambio de Estado
        System.out.println("==PRIMER CAMBIO DE ESTADO==");
        inscripcion1.cambiarEstado(); // Se cambia el estado y pasa a estar "INSCRITO"
        inscripcion1.mostrarEstado(); //Se muestra el estado después del primer cambio
        System.out.println("");

        //Segundo cambio de estado
        System.out.println("==SEGUNDO CAMBIO DE ESTADO==");
        inscripcion1.cambiarEstado(); // Se cambia el estado y pasa a estar "CANCELADO"
        inscripcion1.mostrarEstado(); //Se muestra el estado después del segundo cambio
        System.out.println("");

        //Tercer cambio de estado
        System.out.println("==TERCER CAMBIO DE ESTADO==");
        inscripcion1.cambiarEstado(); // El estado no cambia
        inscripcion1.mostrarEstado(); //Se debe seguir mostando cancelado
        System.out.println("");

        //Strategy
        System.out.println("=======STRATEGY=======");
        System.out.println("");

        //Creamos un alumno
        AlumnoSt enzo = new AlumnoSt("Enzo", Arrays.asList(3,7,6));
        //Usamos la estrategia de Promedio Simple
        System.out.println("==PROMEDIO SIMPLE==");
        enzo.setEstrategia(new PromedioSimple());
        enzo.calcularNotaFinal();
        System.out.println("");

        //Usamos la estrategia de Promedio Ponderado
        System.out.println("==PROMEDIO PONDERADO==");
        enzo.setEstrategia(new PromedioPonderado(Arrays.asList(2,3,9)));
        enzo.calcularNotaFinal();
        System.out.println("");

        //Usamos la estrategia del Examen Extra
        System.out.println("==EXAMEN EXTRA==");
        enzo.setEstrategia(new ExamenExtra(8));
        enzo.calcularNotaFinal();
        System.out.println("");

        //Template Method
        System.out.println("=======TEMPLATE METHOD=======");
        System.out.println("");

        //Creamos dos reportes
        ReporteAcademico r1 = new ReporteCurso("Desarrollo de Software", 7.8, 72);
        ReporteAcademico r2 = new ReporteAlumno("Facundo Rodriguez", "51064", 8.8);

        //Generamos dos reportes (el del curso y el del alumno)
        r1.generarReporte();
        System.out.println("");
        r2.generarReporte();
        System.out.println("");

        //Visitor
        System.out.println("=======VISITOR=======");
        System.out.println("");

        //Creamos alumnos
        AlumnoV luciano = new AlumnoRegular("Luciano Romero", 100000);
        AlumnoV lautaro = new AlumnoBecado("Lautaro Sosa", 100000, 0.5);

        //Creamos una beca para ser aplicada
        Visitor becaDeInvestigacion = new AplicarBeca();

        //Cada alumno la debe aceptar con el método aceptarBeca()
        lautaro.aceptar(becaDeInvestigacion);
        luciano.aceptar(becaDeInvestigacion);





    }
}