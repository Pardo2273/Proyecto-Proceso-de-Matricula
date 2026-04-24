package com.mycompany.matricula;
import javax.swing.JOptionPane;

public class Cursos {
    public String id;
    public String requisito;
    public TipoDeCurso tipo;
    
    public static Cursos cursos[]= new Cursos[20];
    
    public Cursos(){
        id= "";
        requisito= "";
    }
    
    public static void RellenarCursos(){
        for (int i = 0; i < cursos.length; i++) {
            cursos[i]=  new Cursos();
        }
        
        cursos[0].id="C1";
        cursos[0].requisito= "No presenta requisitos";
        cursos[0].tipo= TipoDeCurso.Presencial;
        
        cursos[1].id="C2";
        cursos[1].requisito= "No presenta requisitos";
        cursos[1].tipo= TipoDeCurso.Presencial;
        
        cursos[2].id="C3";
        cursos[2].requisito= "No presenta requisitos";
        cursos[2].tipo= TipoDeCurso.Presencial;
        
        cursos[3].id="C4";
        cursos[3].requisito= "No presenta requisitos";
        cursos[3].tipo= TipoDeCurso.Presencial;
        
        cursos[4].id="C5";
        cursos[4].requisito= "No presenta requisitos";
        cursos[4].tipo= TipoDeCurso.Presencial;
        
        cursos[5].id="C6";
        cursos[5].requisito= "No presenta requisitos";
        cursos[5].tipo= TipoDeCurso.Presencial;
        
        cursos[6].id="C7";
        cursos[6].requisito= "No presenta requisitos";
        cursos[6].tipo= TipoDeCurso.Presencial;
        
        cursos[7].id="C8";
        cursos[7].requisito= "No presenta requisitos";
        cursos[7].tipo= TipoDeCurso.Presencial;
        
        cursos[8].id="C9";
        cursos[8].requisito= "No presenta requisitos";
        cursos[8].tipo= TipoDeCurso.Presencial;
        
        cursos[9].id="C10";
        cursos[9].requisito= "No presenta requisitos";
        cursos[9].tipo= TipoDeCurso.Presencial;
        
        cursos[10].id="C11";
        cursos[10].requisito= "No presenta requisitos";
        cursos[10].tipo= TipoDeCurso.Laboratorio;
        
        cursos[11].id="C12";
        cursos[11].requisito= "No presenta requisitos";
        cursos[11].tipo= TipoDeCurso.Laboratorio;
        
        cursos[12].id="C13";
        cursos[12].requisito= "No presenta requisitos";
        cursos[12].tipo= TipoDeCurso.Laboratorio;
        
        cursos[13].id="C14";
        cursos[13].requisito= "No presenta requisitos";
        cursos[13].tipo= TipoDeCurso.Laboratorio;
        
        cursos[14].id="C15";
        cursos[14].requisito= "No presenta requisitos";
        cursos[14].tipo= TipoDeCurso.Laboratorio;
        
        cursos[15].id="C16";
        cursos[15].requisito= "No presenta requisitos";
        cursos[15].tipo= TipoDeCurso.Virtual;
        
        cursos[16].id="C17";
        cursos[16].requisito= "No presenta requisitos";
        cursos[16].tipo= TipoDeCurso.Virtual;
        
        cursos[17].id="C18";
        cursos[17].requisito= "No presenta requisitos";
        cursos[17].tipo= TipoDeCurso.Virtual;
        
        cursos[18].id = "C19";
        cursos[18].requisito="No presenta requisitos";
        cursos[18].tipo= TipoDeCurso.Virtual;
        
        cursos[19].id ="C20";
        cursos[19].requisito= "No presenta requisitos";
        cursos[19].tipo= TipoDeCurso.Virtual;      
    }
    
    public static void BuscarCurso(){
        String mensaje= "";
        String curso= JOptionPane.showInputDialog("Ingrese el id del curso del que desea recibir informacion ");
        Cursos cursoEncontrado = null;
        for (int i = 0; i < cursos.length; i++) {
            Cursos cursoActual = cursos[i];
            if(cursoActual.id.equals(curso)){
                cursoEncontrado = cursoActual;
                break;
            } 
        }
        if(cursoEncontrado != null){
            mensaje= mensaje + "-ID: " + cursoEncontrado.id + "\n";
            mensaje= mensaje + "-Requisitos del curso" + "\n";
            mensaje= mensaje + " " +cursoEncontrado.requisito + "\n";
            mensaje= mensaje + "-Modalidad del Curso" + "\n";
            mensaje= mensaje + " " + cursoEncontrado.tipo + "\n";
            JOptionPane.showMessageDialog(null, mensaje);
        }
        else{
            mensaje= mensaje + "ID invalido" + "\n";
            mensaje= mensaje + "Favor ingresar un ID valido" + "\n";
            mensaje= mensaje + "Los cursos van del C1 al C20" + "\n";
            mensaje= mensaje + "Cualquier ID que sobre pase el rango anterior es invalido" + "\n";
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
    
}
