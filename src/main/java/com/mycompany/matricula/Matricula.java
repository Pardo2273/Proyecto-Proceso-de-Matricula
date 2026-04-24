package com.mycompany.matricula;

import javax.swing.JOptionPane;

public class Matricula {

    public static void main(String[] args) {
        int opcion;
        Institucion institucion = new Institucion();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion:\n1. Matricular\n2. Congelar\n3. Estadisticas\n4. Información\n0.Salir"));
            switch (opcion) {
                case 1:
                    institucion.Matricular();
                    break;
                case 2:
                    institucion.Congelar();
                    break;
                case 3:
                    institucion.Estadisticas();
                    break;
                case 4:
                    institucion.Informacion();
                    break;
            }
        } while (opcion != 0);
    }
}
