/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ist loja
 */
public class Federacion implements Serializable {
     private String nombre;
    private String pais;
    private int numEquipos;

    public Federacion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

    public Federacion(String nombre, String pais, int numEquipos) {
        this.nombre = nombre;
        this.pais = pais;
        this.numEquipos = numEquipos;
    }

    public void escribirLista(String direccion, List<Federacion> lista) {
        try {
            ObjectOutputStream escribi = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Federacion jugador : lista) {
                escribi.writeObject(jugador);
            }
            escribi.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }

    public Federacion masnumEquipo(List<Federacion> lista) {
        Federacion masnumequipo = lista.get(0);
        for (Federacion federacion : lista) {
            if (federacion.getNumEquipos() > masnumequipo.getNumEquipos()) {
                masnumequipo = federacion;
            }
        }
        return masnumequipo;
    }

    public List<Federacion> leerfede(String url) {

        List<Federacion> Lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Federacion f1 = (Federacion) auxiliar;
                Lista.add(f1);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return Lista;
    }

    public static void main(String[] args) {
        Federacion objeto = new Federacion();
        Federacion f1 = new Federacion("ecuatoriana", "Ecuador", 6);
        Federacion f2 = new Federacion("Mexicana", "Mexico", 8);
        Federacion f3 = new Federacion("española", "españa", 9);
        Federacion f4 = new Federacion("Bogota", "colombia", 12);

        List<Federacion> Lista = new ArrayList<>();
        Lista.add(f1);
        Lista.add(f2);
        Lista.add(f3);
        Lista.add(f4);

        int a = Lista.size();
        System.out.println(a);
        //objeto.escribirLista("C:\\Users\\ist loja\\Desktop\\federacion.txt", Lista);
        List<Federacion> b = objeto.leerfede("C:\\Users\\ist loja\\Desktop\\federacion.txt");
        System.out.println("el equipo mas grande es la federacion " + objeto.masnumEquipo(b).getNombre() + " con " + objeto.masnumEquipo(b).getNumEquipos() + " Equipos");
    }
}


    