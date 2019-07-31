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
public class Comercial extends Empleado {

    private double Comision;

    public Comercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.Comision = comision;
    }

    public boolean Plus() {
        if (super.getEdad() > 30 && this.Comision > 300) {
            double NuevoSalario = (super.getSalario() + this.Plus);
            super.setSalario(NuevoSalario);
            return true;
        }
        return false;
    }

    public void mostrarDatos() {

        System.out.println("NOMBRE: " + this.Nombre + " " + "EDAD: " + this.edad + " " + "SALARIO: " + this.salario + " " + "COMISION: " + this.Comision);
    }
}
