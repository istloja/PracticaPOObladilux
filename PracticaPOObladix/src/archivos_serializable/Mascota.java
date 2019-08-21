/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_serializable;
import java.io.Serializable;
/**
 *
 * @author its
 */
public class Mascota implements Serializable{
    private String nombre;
    private int edad;
    private int numeropatas;
    
 public Mascota(String nombre, int edad, int numeropatas) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeropatas = numeropatas;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeropatas() {
        return numeropatas;
    }

    public void setNumeropatas(int numeropatas) {
        this.numeropatas = numeropatas;
    }

    public Mascota() {
    }

   
    
}
