/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author its
 */
public class Hijo extends Persona {
        Madre madre;
        Padre padre;

    public Hijo(){
    setNombre("vicente ");
    setEdad(0);
    setApellido("luzuriaga ");
    setCedula(1105683963);
    
    }

    public Madre getMadre() {
        return madre;
    }

    public void setMadre(Madre madre) {
        this.madre = madre;
    }

    public Padre getPadre() {
        return padre;
    }

    public void setPadre(Padre padre) {
        this.padre = padre;
    }


    
}
