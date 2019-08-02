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
public class Repartidor extends Empleado {

    private int Zona;
    int numero = 0;

    public Repartidor(int Zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.Zona = Zona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean Plus() {
        if (super.getEdad() < 25 && this.Zona == 3) {
            double Nuevo = (super.getSalario() + this.Plus);
            super.setSalario(Nuevo);
            return true;
        }
        return (false);

    }

    public void mostrarDatos() {

        System.out.println("NOMBRE: " + this.Nombre+ " " +"  "+"EDAD: " + this.edad+ " "  + "SALARIO: " + this.salario + " " + "Zona" + this.Zona);
    }
}
