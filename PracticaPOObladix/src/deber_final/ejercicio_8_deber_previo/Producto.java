/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Previo.ejercicio_8_deber_previo;

/**
 *
 * @author ISTLOJA12
 */
public class Producto {
     protected String Nombre;
 protected double Precio;
 public Producto(String Nombre,double Precio){
     this.Nombre=Nombre;
     this.Precio=Precio;
 }
 public String getNombre(){
     return this.Nombre;
 }
 public void setnombre(String Nombre){
     
     this.Nombre=Nombre;
 }
 public double getPrecio(){
     return this.Precio;
 }
 public void setPrecio(double Precio){
    this.Precio=Precio;
 }
 public double  Calcular(int Cantidad){
     return(this.Precio*Cantidad);
 }



  public String MostrarDatos(){

      return("NOMBRE: "+this.Nombre+" PRECIO: "+this.Precio);
  }  

    

}

