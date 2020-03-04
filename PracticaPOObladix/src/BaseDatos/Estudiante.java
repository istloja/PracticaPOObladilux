/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.util.Date;

/**
 *
 * @author SOFT06
 */
public class Estudiante {

    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private Date F_nacimiento;
    private String correo;
    private String Telefono;

    public Estudiante() {
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Estudiante(String dni, String nombre, String apellido, int edad, Date F_nacimiento, String correo, String Telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.F_nacimiento = F_nacimiento;
        this.correo = correo;
        this.Telefono = Telefono;
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

    public Date getF_nacimiento() {
        return F_nacimiento;
    }

    public void setF_nacimiento(Date F_nacimiento) {
        this.F_nacimiento = F_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", F_nacimiento=" + F_nacimiento + ", correo=" + correo + ", Telefono=" + Telefono + '}';
    }

}

