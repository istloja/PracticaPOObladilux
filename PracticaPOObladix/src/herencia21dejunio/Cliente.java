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
public class Cliente  extends Dueño {// poner extends y la clase ejemplo Dueño para heredar unmetodo de esa clase         Hijo
    public static void main(String[] args) {
        Cliente objeto=new Cliente();// llamo al metodo saludar de la clase dueño
        objeto.saludar();
        objeto.reservar();// llamo metodo reservar
    }
    private String tiempodealquiler;
    
    @Override// significa que el metodo esta sobrescribido
   public void saludar(){//
       // System.out.println("hola soy un cliente");//
    }
    public void test(){
        saludar();
        super.saludar();{// llama al metodo de la clase padre
        
    }
    }
    

    public String getTiempodealquiler() {
        return tiempodealquiler;
    }

    public void setTiempodealquiler(String tiempodealquiler) {
        this.tiempodealquiler = tiempodealquiler;
    }
   public void reservar(){// creo metodo reservar
            System.out.println("reservacion exitosa");}
  

    
    
}
