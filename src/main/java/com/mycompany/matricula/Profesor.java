package com.mycompany.matricula;

import javax.swing.JOptionPane;

public class Profesor {

    public String nombre;
    public String apellido;
    public String correo;
    public String telefono;
    public String curso;
    public TipoDeCurso tipo;
    
    public static Profesor profesores[] = new Profesor[20];

    public Profesor() {
        nombre = "";
        correo = "";
        telefono = "";
        curso = ""; 
    }

    public static void rellenarProfesores() {
        
        for (int i = 0; i < profesores.length; i++) {
            profesores[i] = new Profesor();
        }
        
        profesores[0].nombre = "Juan";
        profesores[0].apellido = "Valverde";
        profesores[0].correo = "juanval@gmail.com";
        profesores[0].telefono = "+506 6058-9310";
        profesores[0].curso = "C1";
        profesores[0].tipo = TipoDeCurso.Presencial;

        profesores[1].nombre = "Gabriel";
        profesores[1].apellido = "Perez";
        profesores[1].correo = "pereldi@gmail.com";
        profesores[1].telefono = "+506 8787-8898";
        profesores[1].curso = "C2";
        profesores[1].tipo = TipoDeCurso.Presencial;

        profesores[2].nombre = "Maria";
        profesores[2].apellido = "Gamboa";
        profesores[2].correo = "mariun@gmail.com";
        profesores[2].telefono = "+506 7525-5445";
        profesores[2].curso = "C3";
        profesores[2].tipo = TipoDeCurso.Presencial;

        profesores[3].nombre = "Jose";
        profesores[3].apellido = "Prado";
        profesores[3].correo = "mkdiJo@hotmail.com";
        profesores[3].telefono = "+506 8741-5225";
        profesores[3].curso = "C4";
        profesores[3].tipo = TipoDeCurso.Presencial;

        profesores[4].nombre = "Andres";
        profesores[4].apellido = "Lopez";
        profesores[4].correo = "lopAd@hotmail.com";
        profesores[4].telefono = "+506 6458-8998";
        profesores[4].curso = "C5";
        profesores[4].tipo = TipoDeCurso.Presencial;

        profesores[5].nombre = "Ismael";
        profesores[5].apellido = "Salguero";
        profesores[5].correo = "salguemi@gmail.com";
        profesores[5].telefono = "+506 8142-6333";
        profesores[5].curso = "C6";
        profesores[5].tipo = TipoDeCurso.Presencial;

        profesores[6].nombre = "Pedro";
        profesores[6].apellido = "Vasquez";
        profesores[6].correo = "vasqPed@gmail.com";
        profesores[6].telefono = "74102022";
        profesores[6].curso = "C7";
        profesores[6].tipo = TipoDeCurso.Presencial;

        profesores[7].nombre = "Carlos";
        profesores[7].apellido = "Sanchez";
        profesores[7].correo = "sancal@hotmail.com";
        profesores[7].telefono = "+506 8520-1669";
        profesores[7].curso = "C8";
        profesores[7].tipo = TipoDeCurso.Presencial;

        profesores[8].nombre = "Sebastian";
        profesores[8].apellido = "Hartley";
        profesores[8].correo = "hart87@gmail.com";
        profesores[8].telefono = "+506 7998-8888";
        profesores[8].curso = "C9";
        profesores[8].tipo = TipoDeCurso.Presencial;

        profesores[9].nombre = "David";
        profesores[9].apellido = "Cascante";
        profesores[9].correo = "cas78cc@hotmail.com";
        profesores[9].telefono = "+506 7884-5115";
        profesores[9].curso = "C10";
        profesores[9].tipo = TipoDeCurso.Presencial;

        profesores[10].nombre = "Andrea";
        profesores[10].apellido = "Cerrud";
        profesores[10].correo = "cerradg@hotmail.com";
        profesores[10].telefono = "+506 6230-3003";
        profesores[10].curso = "C11";
        profesores[10].tipo = TipoDeCurso.Laboratorio;

        profesores[11].nombre = "Jimena";
        profesores[11].apellido = "Solano";
        profesores[11].correo = "soljim45@gmail.com";
        profesores[11].telefono = "+506 7215-6566";
        profesores[11].curso = "C12";
        profesores[11].tipo = TipoDeCurso.Laboratorio;

        profesores[12].nombre = "Karla";
        profesores[12].apellido = "Portilla";
        profesores[12].correo = "port4562@hotmail.com";
        profesores[12].telefono = "+506 8529-6333";
        profesores[12].curso = "C13";
        profesores[12].tipo = TipoDeCurso.Laboratorio;

        profesores[13].nombre = "Biden";
        profesores[13].apellido = "Ramirez";
        profesores[13].correo = "rambid@gmail.com";
        profesores[13].telefono = "+506 8000-0110";
        profesores[13].curso = "C14";
        profesores[13].tipo = TipoDeCurso.Laboratorio;

        profesores[14].nombre = "Julian";
        profesores[14].apellido = "Solis";
        profesores[14].correo = "jupldfs@hotmail.com";
        profesores[14].telefono = "+506 7001-1114";
        profesores[14].curso = "C15";
        profesores[14].tipo = TipoDeCurso.Laboratorio;

        profesores[15].nombre = "Milena";
        profesores[15].apellido = "Gomez";
        profesores[15].correo = "milenak@hotmail.com";
        profesores[15].telefono = "+506 8995-5555";
        profesores[15].curso = "C16";
        profesores[15].tipo = TipoDeCurso.Virtual;

        profesores[16].nombre = "Angelica";
        profesores[16].apellido = "Arrones";
        profesores[16].correo = "arran787@gmail.com";
        profesores[16].telefono = "+506 7562-3363";
        profesores[16].curso = "C17";
        profesores[16].tipo = TipoDeCurso.Virtual;

        profesores[17].nombre = "Matias";
        profesores[17].apellido = "Carmona";
        profesores[17].correo = "carmo6767@gmail.com";
        profesores[17].telefono = "+506 6767-8889";
        profesores[17].curso = "C18";
        profesores[17].tipo = TipoDeCurso.Virtual;

        profesores[18].nombre = "Angel";
        profesores[18].apellido = "Robles";
        profesores[18].correo = "rob44@gmail.com";
        profesores[18].telefono = "+506 6444-1001";
        profesores[18].curso = "C19";
        profesores[18].tipo = TipoDeCurso.Virtual;

        profesores[19].nombre = "Silvia";
        profesores[19].apellido = "Serrano";
        profesores[19].correo = "sersilva@gmail.com";
        profesores[19].telefono = "+506 8005-5547";
        profesores[19].curso = "C20";
        profesores[19].tipo = TipoDeCurso.Virtual;

    }

    public static void buscarProfesor() {
        String mensaje="";
        String curso = JOptionPane.showInputDialog("Ingrese el id del curso que desea consultar");
        Profesor profesorEncontrado = null;
        for (int i = 0; i < profesores.length; i++) {
            Profesor profesorActual = profesores[i];
            if (profesorActual.curso.equals(curso)) {
                profesorEncontrado = profesorActual;
                break;
            }
        }
        if (profesorEncontrado != null) {
            mensaje= mensaje + "Nombre: " + profesorEncontrado.nombre + " "+profesorEncontrado.apellido + "\n";
            mensaje= mensaje + "Medios para ser contactado" + "\n";
            mensaje= mensaje + "Telefono: " + profesorEncontrado.telefono + "\n" + "Correo: " + profesorEncontrado.correo + "\n";
            mensaje= mensaje + "Modalidad del curso " + "\n" + profesorEncontrado.tipo + "\n";
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "Curso no encontrado, favor ingresar un curso valido");
        }
    }
}
