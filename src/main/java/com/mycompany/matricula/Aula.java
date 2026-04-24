package com.mycompany.matricula;

import javax.swing.JOptionPane;

public class Aula {
    public String ID;
    public String cursoID;
    public String profeNombre;
    public String profeApellido;
    public String profeCorreo;
    public String profeTelefono;
    public TipoDeAula tipo;
    
    public static Aula aula[]= new Aula[20];
    
    public Aula(){
        ID="";
        cursoID= "";
        profeNombre= "";
        profeApellido="";
        profeCorreo= "";
        profeTelefono="";
    }
    
    public static void RellenarAula(){
        for (int i = 0; i < aula.length; i++) {
            aula[i]=  new Aula();
        }
        
        aula[0].ID= "A001";
        aula[0].cursoID= "C1";
        aula[0].profeNombre= "Juan";
        aula[0].profeApellido= "Valverde";
        aula[0].profeCorreo= "juanval@gmail.com";
        aula[0].profeTelefono= "+506 6058-9310";
        aula[0].tipo= TipoDeAula.Fisica;
        
        aula[1].ID= "A002";
        aula[1].cursoID= "C2";
        aula[1].profeNombre= "Gabriel";
        aula[1].profeApellido= "Perez";
        aula[1].profeCorreo= "pereldi@gmail.com";
        aula[1].profeTelefono= "+506 8787-8898";
        aula[1].tipo= TipoDeAula.Fisica;
        
        aula[2].ID= "A003";
        aula[2].cursoID= "C3";
        aula[2].profeNombre= "Maria";
        aula[2].profeApellido= "Gamboa";
        aula[2].profeCorreo= "mariun@gmail.com";
        aula[2].profeTelefono= "+506 7525-5445";
        aula[2].tipo= TipoDeAula.Fisica;
        
        aula[3].ID= "A004";
        aula[3].cursoID= "C4";
        aula[3].profeNombre= "Jose";
        aula[3].profeApellido= "Prado";
        aula[3].profeCorreo= "mkdiJo@hotmail.com";
        aula[3].profeTelefono= "+506 8741-5225";
        aula[3].tipo= TipoDeAula.Fisica;
        
        aula[4].ID= "A005";
        aula[4].cursoID= "C5";
        aula[4].profeNombre= "Andres";
        aula[4].profeApellido= "Lopez";
        aula[4].profeCorreo= "lopAd@hotmail.com";
        aula[4].profeTelefono= "+506 6458-8998";
        aula[4].tipo= TipoDeAula.Fisica;
        
        aula[5].ID= "A006";
        aula[5].cursoID= "C6";
        aula[5].profeNombre= "Ismael";
        aula[5].profeApellido= "Salguero";
        aula[5].profeCorreo= "salguemi@gmail.com";
        aula[5].profeTelefono= "+506 8142-6333";
        aula[5].tipo= TipoDeAula.Fisica;
        
        aula[6].ID= "A007";
        aula[6].cursoID= "C7";
        aula[6].profeNombre= "Pedro";
        aula[6].profeApellido= "Vasquez";
        aula[6].profeCorreo= "vasqPed@gmail.com";
        aula[6].profeTelefono= "74102022";
        aula[6].tipo= TipoDeAula.Fisica;
   
        aula[7].ID= "A008";
        aula[7].cursoID= "C8";
        aula[7].profeNombre= "Carlos";
        aula[7].profeApellido= "Sanchez";
        aula[7].profeCorreo= "sancal@hotmail.com";
        aula[7].profeTelefono= "+506 8520-1669";
        aula[7].tipo= TipoDeAula.Fisica;
        
        aula[8].ID= "A009";
        aula[8].cursoID= "C9";
        aula[8].profeNombre= "Sebastian";
        aula[8].profeApellido= "Hartley";
        aula[8].profeCorreo= "hart87@gmail.com";
        aula[8].profeTelefono= "+506 7998-8888";
        aula[8].tipo= TipoDeAula.Fisica;
       
        aula[9].ID= "A0010";
        aula[9].cursoID= "C10";
        aula[9].profeNombre= "David";
        aula[9].profeApellido= "Cascante";
        aula[9].profeCorreo= "cas78cc@hotmail.com";
        aula[9].profeTelefono= "+506 7884-5115";
        aula[9].tipo= TipoDeAula.Fisica;
        
        aula[10].ID="LAB001";
        aula[10].cursoID= "C11";
        aula[10].profeNombre= "Andrea";
        aula[10].profeApellido= "Cerrud";
        aula[10].profeCorreo= "cerradg@hotmail.com";
        aula[10].profeTelefono= "+506 6230-3003";
        aula[10].tipo= TipoDeAula.Laboratorio;
        
        aula[11].ID="LAB002";
        aula[11].cursoID= "C12";
        aula[11].profeNombre= "Jimena";
        aula[11].profeApellido= "Solano";
        aula[11].profeCorreo= "soljim45@gmail.com";
        aula[11].profeTelefono= "+506 7215-6566";
        aula[11].tipo= TipoDeAula.Laboratorio;
        
        aula[12].ID="LAB003";
        aula[12].cursoID= "C13";
        aula[12].profeNombre= "Karla";
        aula[12].profeApellido= "Portilla";
        aula[12].profeCorreo= "port4562@hotmail.com";
        aula[12].profeTelefono= "+506 8529-6333";
        aula[12].tipo= TipoDeAula.Laboratorio;
        
        aula[13].ID="LAB004";
        aula[13].cursoID= "C14";
        aula[13].profeNombre= "Biden";
        aula[13].profeApellido= "Ramirez";
        aula[13].profeCorreo= "rambid@gmail.com";
        aula[13].profeTelefono= "+506 8000-0110";
        aula[13].tipo= TipoDeAula.Laboratorio;
        
        aula[14].ID="LAB005";
        aula[14].cursoID= "C15";
        aula[14].profeNombre= "Julian";
        aula[14].profeApellido= "Solis";
        aula[14].profeCorreo= "jupldfs@hotmail.com";
        aula[14].profeTelefono= "+506 7001-1114";
        aula[14].tipo= TipoDeAula.Laboratorio;
        
        aula[15].ID="VIRT10";
        aula[15].cursoID= "C16";
        aula[15].profeNombre= "Milena";
        aula[15].profeApellido= "Gomez";
        aula[15].profeCorreo= "milenak@hotmail.com";
        aula[15].profeTelefono= "+506 8995-5555";
        aula[15].tipo= TipoDeAula.Virtual;
        
        aula[16].ID="VIRT11";
        aula[16].cursoID= "C17";
        aula[16].profeNombre= "Angelica";
        aula[16].profeApellido= "Arrones";
        aula[16].profeCorreo= "arran787@gmail.com";
        aula[16].profeTelefono= "+506 7562-3363";
        aula[16].tipo= TipoDeAula.Virtual;
        
        aula[17].ID="VIRT12";
        aula[17].cursoID= "C18";
        aula[17].profeNombre= "Matias";
        aula[17].profeApellido= "Carmona";
        aula[17].profeCorreo= "carmo6767@gmail.com";
        aula[17].profeTelefono= "+506 6767-8889";
        aula[17].tipo= TipoDeAula.Virtual;
        
        aula[18].ID="VIRT13";
        aula[18].cursoID= "C19";
        aula[18].profeNombre= "Angel";
        aula[18].profeApellido= "Robles";
        aula[18].profeCorreo= "rob44@gmail.com";
        aula[18].profeTelefono= "+506 6444-1001";
        aula[18].tipo= TipoDeAula.Virtual;
        
        aula[19].ID="VIRT14";
        aula[19].cursoID= "C20";
        aula[19].profeNombre= "Silvia";
        aula[19].profeApellido= "Serrano";
        aula[19].profeCorreo= "sersilva@gmail.com";
        aula[19].profeTelefono= "+506 8005-5547";
        aula[19].tipo= TipoDeAula.Virtual;
    }
    
    public static void BuscarAula(){
        String mensaje="";
        String curso= JOptionPane.showInputDialog("Ingrese el id del curso para mostrar la informacion del aula asignada");
        Aula aulaEncontrada = null;
        for(int i= 0; i < aula.length; i++){
            Aula aulaActual = aula[i];
            if(aulaActual.cursoID.equals(curso)){
                aulaEncontrada = aulaActual;
                break;
            }   
        }
        if(aulaEncontrada != null){
            mensaje = mensaje + "ID Aula: " + aulaEncontrada.ID + "\n";
            mensaje = mensaje + "Curso asociado al aula " + "\n";
            mensaje= mensaje + aulaEncontrada.cursoID + "\n";
            mensaje= mensaje + "Aula del profesor: " + aulaEncontrada.profeNombre + " " + aulaEncontrada.profeApellido + "\n";
            mensaje = mensaje + "Medios para contactar al profesor" + "\n";
            mensaje = mensaje + "Correo: " + aulaEncontrada.profeCorreo + "\n";
            mensaje = mensaje + "Telefono: " + aulaEncontrada.profeTelefono + "\n";
            mensaje= mensaje + "El tipo de aula es: " + aulaEncontrada.tipo;
            JOptionPane.showMessageDialog(null, mensaje);
        } 
        else{
            mensaje= mensaje + "ID de curso invalido" + "\n";
            mensaje= mensaje + "Favor ingresar un ID de curso valido" + "\n";
            mensaje= mensaje + "Recuerde que los cursos van del rango de C1 hasta C20" + "\n";
            mensaje= mensaje + "Si el curso ingresado esta fuera de ese rango es imposible mostrar informacion" + "\n";
            mensaje= mensaje + "Favor volver a intentarlo de nuevo"+ "\n";
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}
