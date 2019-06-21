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
public class Empleado extends Cliente {
    private String cargo;
   
    public void cargo(){
        System.out.println(" soy el jefe");
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public static void main(String[] args) {
            Empleado objeto=new Empleado();
            objeto.cargo();
            objeto.reservar();
    }
    
}
