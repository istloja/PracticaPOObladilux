/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Previo.ejercioo_7_deber_previo;

/**
 *
 * @author ISTLOJA12
 */
public abstract class Empleado {
 protected String Nombre;
 protected int edad;
 protected double salario;
 final int Plus=300;

  public Empleado(String nombre,int edad,double salario){
      this.Nombre=nombre;
      this.edad=edad;
      this.salario=salario;
       }
  public void setNombre(String Nombre){
       this.Nombre=Nombre;
        }
  public String getNombre(){
      return Nombre;
  }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
 public abstract boolean Plus(); 
 public void mostrarDatos(){
   System.out.println("NOMBRE: "+this.Nombre+ " " + " " +"EDAD: "+this.edad+ " " +" " +"SALARIO: "+this.salario);
 }
 }

