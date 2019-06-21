/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia21dejunio;

/**
 *
 * @author ist loja
 */
public class Dueño {// padre
    private int id;
	private String Nombre;
	private String Apellidos;
	private int Edad;
	private double sueldo;
	
    

     public void saludar(){
         System.out.println("Hola");}
     public void despedir(){
         System.out.println("chao");
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
     public static void main(String[] args) {
        Dueño objeto=new Dueño();//creamos objeto
        objeto.setNombre("vicente");// asignamos valor ala variable nombre
        System.out.println(objeto.getNombre());// imprimimos el valor de Nombre
        
    }
    


}