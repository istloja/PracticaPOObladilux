/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

/**
 *
 * @author ISTLOJA_03
 */
public class Boleto {
      private Double precio;
    private final Double m = 0.15;
    private final Double f = 0.30;
    private final Double e = 0.10;

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public double descuento(String descuento) {
        double a=0;
       
        if(descuento=="menor"){
            a=precio*50/100;
            
        }else if(descuento=="fumador"){
            a=precio*f;
            
        }else if(descuento=="estudiante"){
            a=precio*e;
          
        }
        return a;
        
        

    }

}

    

