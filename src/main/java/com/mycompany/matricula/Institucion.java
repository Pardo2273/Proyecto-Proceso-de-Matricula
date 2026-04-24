package com.mycompany.matricula;

import javax.swing.JOptionPane;

public class Institucion {
    public Estudiante estudiante[][] = new Estudiante[20][20];

    public Institucion() {
        this.estudiante = new Estudiante[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                estudiante[i][j] = new Estudiante();
            }
        }
    }

    private int proximaPosicion(Estudiante[] curso) {
        for (int i = 0; i < curso.length; i++) {
            if (curso[i].estado == Estado.Disponible) {
                return i;
            }
        }
        return -1;
    }

    public void Matricular() {
        String nombre, correo, telefono, curso;
        int materias, cursoNumero;
        nombre = JOptionPane.showInputDialog("Nombre");
        correo = JOptionPane.showInputDialog("Correo");
        telefono = JOptionPane.showInputDialog("Teléfono");
        materias = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de materias a matricular"));
        if (materias < 2) {
            JOptionPane.showMessageDialog(null, "Cantidad de materias insuficiente para matricular");
        } else if (materias > 6) {
            JOptionPane.showMessageDialog(null, "Cantidad de materias superada para matricular");
        } else {
            for (int i = 0; i < materias; i++) {
                curso = JOptionPane.showInputDialog("Ingrese el id del curso"); 
                cursoNumero = Integer.parseInt(curso.replace("C", ""));
                if (cursoNumero <= 10 && cursoNumero >= 1) {
                    JOptionPane.showMessageDialog(null, "Ha seleccionado " + "C" + cursoNumero + "\nEl curso es presencial");
                } else if (cursoNumero <= 15 && cursoNumero >= 11) {
                    JOptionPane.showMessageDialog(null, "Ha seleccionado " + "C" + cursoNumero + "\nEl curso es de laboratorio");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha seleccionado " + "C" + cursoNumero + "\nEl curso es virtual");
                }
                Estudiante[] cursoSeleccionado = estudiante[cursoNumero - 1];
                int posicion = proximaPosicion(cursoSeleccionado);
                estudiante[cursoNumero - 1][posicion].setCorreo(correo);
                estudiante[cursoNumero - 1][posicion].setTelefono(telefono);
                estudiante[cursoNumero - 1][posicion].setNombre(nombre);
                estudiante[cursoNumero - 1][posicion].estado = Estado.Ocupado;
            }

            int valorMateria = 120000;
            int valorMatricula = 70000;
            int descuento;
            int valorTotal;
            if (materias == 2 || materias == 3) {
                valorTotal = (valorMateria * materias) + valorMatricula;
                int pago = Integer.parseInt(JOptionPane.showInputDialog("El monto a cancelar es de: ₡" + valorTotal + " colones\nSe le aplicó un 10% de descuento en el pago de materias por matricular " + materias + " materias\n¿Con cuanto desea cancelar?"));
                int vuelto = pago - (valorTotal);
                if (vuelto == 0) {
                    JOptionPane.showMessageDialog(null, "¡Ha matriculado de manera exitosa!");
                }
                else if(vuelto < 0){
                    JOptionPane.showMessageDialog(null, "Fondos insuficientes");
                }
                else {
                    JOptionPane.showMessageDialog(null, "¡Ha matriculado de manera exitosa!\nSu vuelto es de: ₡" + vuelto + " colones");
                }
            } else if (materias == 4 || materias == 5) {
                valorTotal = valorMateria * materias;
                descuento = valorTotal - ((valorTotal * 10) / 100);
                valorTotal = descuento + valorMatricula;
                int pago = Integer.parseInt(JOptionPane.showInputDialog("El monto a cancelar es de: ₡" + valorTotal + " colones\nSe le aplicó un 10% de descuento en el pago de materias por matricular " + materias + " materias\n¿Con cuanto desea cancelar?"));
                int vuelto = pago - (valorTotal);
                if (vuelto == 0) {
                    JOptionPane.showMessageDialog(null, "¡Ha matriculado de manera exitosa!");
                } else {
                    JOptionPane.showMessageDialog(null, "¡Ha matriculado de manera exitosa!\nSu vuelto es de: ₡" + vuelto + " colones");
                }
            } else if (materias == 6) {
                valorTotal = valorMateria * materias;
                descuento = valorTotal - ((valorTotal * 15) / 100);
                valorMatricula = valorMatricula - ((valorMatricula * 5) / 100);
                valorTotal = descuento + valorMatricula;
                int pago = Integer.parseInt(JOptionPane.showInputDialog("El monto a cancelar es de: " + valorTotal + "\nSe le aplicó un 15% de descuento en el pago de materias por matricular " + materias + " materias\nY un 5% en su matrícula\n¿Con cuanto desea cancelar?"));
                int vuelto = pago - (valorTotal);
                if (vuelto == 0) {
                    JOptionPane.showMessageDialog(null, "¡Ha matriculado de manera exitosa!");
                } else {
                    JOptionPane.showMessageDialog(null, "¡Ha matriculado de manera exitosa!\nSu vuelto es de: ₡" + vuelto + " colones");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selección inválida");
            }
        }
    }

    public void Congelar() {
        String curso;
        String telefono;
        curso = JOptionPane.showInputDialog("Ingrese el id del curso");
        int cursoNumero = Integer.parseInt(curso.replace("C", ""));
        telefono = JOptionPane.showInputDialog("Ingrese su número de teléfono");

        Estudiante[] cursoEncontrado = estudiante[cursoNumero - 1];
        boolean encontroEstudiante = false;
        for (int i = 0; i < cursoEncontrado.length; i++) {
            Estudiante estudianteActual = cursoEncontrado[i];
            if (estudianteActual.getTelefono().equals(telefono)) {
                estudianteActual.setEstado(Estado.Congelado);
                encontroEstudiante = true;
                break;
            }
        }
        if (!encontroEstudiante) {
            JOptionPane.showMessageDialog(null, "Usted ha congelado en el curso: " + cursoNumero);
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
        }
    }

    public void Estadisticas() {
        int opcion;

        int contPresencialMat = 0; 
        int contLaboratorioMat = 0; 
        int contVirtualMat = 0; 
        int contDisponiblePre = 0;
        int contDisponibleLab = 0;
        int contDisponibleVir = 0;

        for (int c = 0; c < 9; c++) {
            for (int t = 0; t < estudiante[c].length; t++) {
                if (estudiante[c][t].getEstado().equals(Estado.Ocupado)) {
                    contPresencialMat++;
                } else {
                    contDisponiblePre++;
                }
            }
        }

        for (int c = 10; c < 14; c++) {
            for (int t = 0; t < estudiante[c].length; t++) {
                if (estudiante[c][t].getEstado().equals(Estado.Ocupado)) {
                    contLaboratorioMat++;
                } else {
                    contDisponibleLab++;
                }
            }
        }

        for (int c = 15; c < 19; c++) {
            for (int t = 0; t < estudiante[c].length; t++) {
                if (estudiante[c][t].getEstado().equals(Estado.Ocupado)) {
                    contVirtualMat++;
                } else {
                    contDisponibleVir++;
                }
            }
        }

        int totalMatriculados = contPresencialMat + contLaboratorioMat + contVirtualMat;
        int totalDisponibles = contDisponiblePre + contDisponibleLab + contDisponibleVir;
        int total = totalMatriculados + totalDisponibles;
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("ESTADÍSTICAS\n1. Ocupacion de cursos en general\n"
                    + "2. Procentaje de ocupación de cursos (Virtual, Presencial o Laboratorio)\n"
                    + "0. Volver"));
            switch (opcion) {
                case 1:
                    int porcentaje = 0;
                    porcentaje = (totalMatriculados / total) * 400;
                    JOptionPane.showMessageDialog(null, "PORCENTAJE DE OCUPACIÓN DE CURSOS EN GENERAL\n"
                            + porcentaje + "%");
                    break;
                case 2:
                    int contPresencial = (contPresencialMat * 200 / 100);
                    int contLaboratorio = (contLaboratorioMat * 100 / 100);
                    int contVirtual = (contVirtualMat * 100 / 100);
                    JOptionPane.showMessageDialog(null, "PORCENTAJE DE OCUPACIÓN DE CURSOS\n"
                            + "Presenciales: " + contPresencial + "%\n"
                            + "Virtuales: " + contVirtual + "%\n"
                            + "Laboratorio: " + contLaboratorio + "%");
                    break;
            }

        } while (opcion != 0);
    }

    public void Informacion() {
        int opcion;
        Profesor.rellenarProfesores();
        Aula.RellenarAula();
        Cursos.RellenarCursos();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("INFORMACIÓN\n1. Profesores\n2. Descuentos\n3. Requisitos\n4. Costos\n5. Cursos\n6. Aulas\n0. Volver"));
            switch (opcion) {
                case 1:
                    Profesor.buscarProfesor();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "DESCUENTOS\n"
                            + "Si matricula menos de 3 materias no tendrá ningún descuento\n"
                            + "Si desea matricular 4 ó 5 materias, se le aplicará un descuento del 10% en sus materias\n"
                            + "Si desea matricular 6 materias, se le aplicará un descuento del 15% en sus materias y un 5% en la matrícula");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "REQUISITOS\nLa univerdad tiene el requisito de matrícula mínima de 2 materias"
                            + " y como máximo podrá matricular 6\n"
                            + "Las materias impartidas aún no cuentan con requisitos previos\n"
                            + "(Sujeto a cambios y disponibilidad de espacios en los cursos)");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "COSTOS\n"
                            + "Los precios por materia tienen un monto fijo de ₡120000 colones\n"
                            + "La matrícula tiene un valor de ₡70000 colones");
                    break;
                case 5:
                    Cursos.BuscarCurso();
                    break;
                case 6:
                    Aula.BuscarAula();
                    break;
            }
        } while (opcion != 0);
    }
}
