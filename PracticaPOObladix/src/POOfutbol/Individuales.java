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
public class Individuales extends Deportes{
    private int jugador1;
    private String lugarRealiza;
    private String reglasbasicas;
    private int puntosganar;
    private String instrumentoUtiliza;

    public Individuales(int jugador1, String lugarRealiza, String reglasbasicas, int puntosganar, String instrumentoUtiliza, int tiempo, String creador, int fechaCreacion, String lugarCreacion, String nombre) {
        super(tiempo, creador, fechaCreacion, lugarCreacion, nombre);
        this.jugador1 = jugador1;
        this.lugarRealiza = lugarRealiza;
        this.reglasbasicas = reglasbasicas;
        this.puntosganar = puntosganar;
        this.instrumentoUtiliza = instrumentoUtiliza;
    }

  
    public Individuales() {
    }

    public int getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public String getLugarRealiza() {
        return lugarRealiza;
    }

    public void setLugarRealiza(String lugarRealiza) {
        this.lugarRealiza = lugarRealiza;
    }

    public String getReglasbasicas() {
        return reglasbasicas;
    }

    public void setReglasbasicas(String reglasbasicas) {
        this.reglasbasicas = reglasbasicas;
    }

    public int getPuntosganar() {
        return puntosganar;
    }

    public void setPuntosganar(int puntosganar) {
        this.puntosganar = puntosganar;
    }

    public String getInstrumentoUtiliza() {
        return instrumentoUtiliza;
    }

    public void setInstrumentoUtiliza(String instrumentoUtiliza) {
        this.instrumentoUtiliza = instrumentoUtiliza;
    }

}