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
public class NoPerecedero extends Producto{
 private String Tipo;

 public NoPerecedero(String Tipo,String Nombre,double Precio){
     super(Nombre,Precio);
     this.Tipo=Nombre;
     
 }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
 public String MostrarDatos(){
      return("NOMBRE: "+this.Nombre+" PRECIO: "+this.Precio+" TIPO: "+this.Tipo);
  }  

}
   