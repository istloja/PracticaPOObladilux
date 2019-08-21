/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaArchivozSerializables;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Materia implements Serializable {
    private String nombre;
    private int creditos;
    private String docente;
    private Carrera carrera;
    //constructor

    public Materia() {
    }

    public Materia(String nombre, int creditos, String docente, Carrera carrera) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.docente = docente;
        this.carrera = carrera;
    }
    //  getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    
    
    
}
