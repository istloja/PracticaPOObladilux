/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables_practica;

import archivosSerializables.Jugador;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ist loja
 */
public class Autor  implements Serializable{
   

    private String nombre;
    private String apellido;
    private int edad;
    private int librospublicados;
    private int fechaNacimineto;

    public Autor() {
    }

    public Autor(String nombre, String apellido, int edad, int librospublicados, int fechaNacimineto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.librospublicados = librospublicados;
        this.fechaNacimineto = fechaNacimineto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getLibrospublicados() {
        return librospublicados;
    }

    public void setLibrospublicados(int librospublicados) {
        this.librospublicados = librospublicados;
    }

    public int getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(int fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

}


