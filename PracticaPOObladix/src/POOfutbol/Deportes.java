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
public class Deportes {
    private int tiempo;
    private String creador;
    private int fechaCreacion;
    private String lugarCreacion;
    private String nombre;

    public Deportes(int tiempo, String creador, int fechaCreacion, String lugarCreacion, String nombre) {
        this.tiempo = tiempo;
        this.creador = creador;
        this.fechaCreacion = fechaCreacion;
        this.lugarCreacion = lugarCreacion;
        this.nombre = nombre;
    }

    public Deportes() {
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(int fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getLugarCreacion() {
        return lugarCreacion;
    }

    public void setLugarCreacion(String lugarCreacion) {
        this.lugarCreacion = lugarCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
public void miEquipof(){
            System.out.println("hola mi equipo es Ecuador");
} 
public String detalleEquipo(){
    String detalle=tiempo+" "+creador+" "+fechaCreacion+" "+lugarCreacion+" "+nombre;
    return detalle;

}
public void miEquipoNf(){
    System.out.println("varcelona");
}

}
