/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoPOO;

/**
 *
 * @author ist loja
 */
public class Anfibios extends Animales{
    private boolean nada;
    private String piel;

    public Anfibios(boolean nada, String piel) {
        this.nada = nada;
        this.piel = piel;
    }

    public Anfibios(boolean nada, String piel, String nombre, double edad, double peso, String color, double altutra) {
        super(nombre, edad, peso, color, altutra);
        this.nada = nada;
        this.piel = piel;
    }

    public Anfibios() {
    }

    public boolean isNada() {
        return nada;
    }

    public void setNada(boolean nada) {
        this.nada = nada;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }
    
    
}
