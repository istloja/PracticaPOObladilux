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
public class Perecedero extends Producto {
 private int DiasCaducar;  
 public Perecedero(int DiasCaducar,String Nombre,double Precio){
     super( Nombre, Precio);
     this.DiasCaducar=DiasCaducar;
 }

    public int getDiasCaducar() {
        return DiasCaducar;
    }

    public void setDiasCaducar(int DiasCaducar) {
        this.DiasCaducar = DiasCaducar;
    }
   public double  Calcular(int Cantidad){
     double  PrecioTotal=Cantidad*this.Precio;
     
     switch(this.DiasCaducar){
         case 1:
               PrecioTotal=(PrecioTotal/4);
             break;
         case 2:
             PrecioTotal=(PrecioTotal/3);
             break;
         case 3:
             PrecioTotal=(PrecioTotal/2);
             break;
     }  
       return ( PrecioTotal);
   }
     
     

  public String MostrarDatos(){
      return("NOMBRE: "+this.Nombre+" PRECIO: "+this.Precio+" DIAS A CADUCAR: "+this.DiasCaducar);
  } 

}

