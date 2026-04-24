package com.mycompany.matricula;

import javax.swing.JOptionPane;

public class Estudiante {

    private String nombre;
    private String correo;
    private String telefono;

    
    public Estado estado;
    public TipoDeCurso tipo;
    public int materias;

    public Estudiante() {
        nombre = "";
        correo = "";
        telefono = "";
        estado = Estado.Disponible;
        tipo = TipoDeCurso.Indefinido;
        materias = 0;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo.length() == 0) {
            JOptionPane.showMessageDialog(null, "El correo no puede estar vacío");
        } else if (!correo.contains("@")) {
            JOptionPane.showMessageDialog(null, "Formato inválido");
        } else {
            this.correo = correo;
        }
    }

    public String getTelefono() {
        telefono = "+506 " + telefono;
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() == 0) {
            JOptionPane.showMessageDialog(null, "El teléfono no puede estar vacío");
        } else {
            this.telefono = telefono;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", estado=" + estado + ", tipo=" + tipo + ", materias=" + materias + '}';
    }
    
    
    
}
