/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOfutbol;

/**
 *
 * @author kevin
 */
public class Equipos extends Deportes {
private int numeroJugadores;
private int tecnicos;
private boolean lider;
private String colorUniforme;
private String instrumento;

    public Equipos(int numeroJugadores, int tecnicos, boolean lider, String colorUniforme, String instrumento, int tiempo, String creador, int fechaCreacion, String lugarCreacion, String nombre) {
        super(tiempo, creador, fechaCreacion, lugarCreacion, nombre);
        this.numeroJugadores = numeroJugadores;
        this.tecnicos = tecnicos;
        this.lider = lider;
        this.colorUniforme = colorUniforme;
        this.instrumento = instrumento;
    }

    public Equipos() {
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public int getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(int tecnicos) {
        this.tecnicos = tecnicos;
    }

    public boolean isLider() {
        return lider;
    }

    public void setLider(boolean lider) {
        this.lider = lider;
    }

    public String getColorUniforme() {
        return colorUniforme;
    }

    public void setColorUniforme(String colorUniforme) {
        this.colorUniforme = colorUniforme;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

}
