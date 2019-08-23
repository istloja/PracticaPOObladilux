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
 * @author its
 */
public class Jugador implements Serializable {

    private String nombre;

    private String apellido;

    private int edad;

    private int numeroGoles;

    private int añoDebut;

    private Equipo equipo;

    public Jugador(String nombre, String apellido, int edad, int numeroGoles, int añoDebut, Equipo equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
        this.añoDebut = añoDebut;
        this.equipo = equipo;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getAñoDebut() {
        return añoDebut;
    }

    public void setAñoDebut(int añoDebut) {
        this.añoDebut = añoDebut;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void escribirLista(String direccion, List<Jugador> lista) {
        try {
            ObjectOutputStream escr = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Jugador jugador : lista) {
                escr.writeObject(jugador);
            }
            escr.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }

    public int edadMayor(List<Jugador> lista) {
        int edadmax = lista.get(0).getEdad();
        for (Jugador jugador : lista) {
            if (jugador.getEdad() > edadmax) {

                edadmax = jugador.getEdad();

            } else {
                System.out.println("");
            }

        }

        return edad;

    }

    public Jugador edadmenorObjeto(List<Jugador> lista) {
        Jugador edadmenor = lista.get(0);
        for (Jugador jugador : lista) {
            if (edadmenor.getEdad() > jugador.getEdad()) {
                edadmenor = jugador;
            }
        }
        return edadmenor;
    }

    public Jugador masGoles(List<Jugador> lista) {
        Jugador mayorgoles = lista.get(0);
        for (Jugador jugador : lista) {
            if (jugador.getNumeroGoles() > mayorgoles.getNumeroGoles()) {
                mayorgoles = jugador;
            }
        }
        return mayorgoles;
    }

    public Jugador debutoP(List<Jugador> lista) {
        Jugador debuto = lista.get(0);
        for (Jugador jugador : lista) {
            if (debuto.getAñoDebut() > jugador.getAñoDebut()) {
                debuto = jugador;
            }

        }
        return debuto;
    }

    public Jugador titulos(List<Jugador> lista) {
        Jugador mastitulo = lista.get(0);
        for (Jugador jugador : lista) {
            if (jugador.getEquipo().getNumerotitulos() > mastitulo.getEquipo().getNumerotitulos()) {
                mastitulo = jugador;
            }

        }
        return mastitulo;
    }

    public void leerLista(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Jugador j1 = (Jugador) auxiliar;
            System.out.println("nombre" + j1.nombre + "apellido" + j1.apellido);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Jugador> leerJugadores(String url) {

        List<Jugador> Lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador j1 = (Jugador) auxiliar;
                Lista.add(j1);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return Lista;

    }

    public static void main(String[] args) {
        Jugador objeto = new Jugador();
        Jugador j1 = new Jugador("cristiano", "Ronaldo", 33, 520, 2005, new Equipo("juventus", 20, "Turin"));
        Jugador j2 = new Jugador("Lionel", "Messi", 31, 600, 2001, new Equipo("Barcelona", 30, "Barcelona"));
        Jugador j3 = new Jugador("Neymar", "Jr", 28, 200, 2011, new Equipo("PSG", 10, "Paris"));
        Jugador j4 = new Jugador("Eden", "Hazard", 27, 1590, 2010, new Equipo("Real Madrid", 40, "Madrid"));

        List<Jugador> Lista = new ArrayList<>();
        Lista.add(j1);
        Lista.add(j2);
        Lista.add(j3);
        Lista.add(j4);
        int a = Lista.size();//guardo en la variable a esta me permite saber el tamaño de lista (.size())
        System.out.println(a);
        objeto.escribirLista("C:\\Users\\ist loja\\Desktop\\ejemplo2.txt", Lista);
        objeto.leerLista("C:\\Users\\ist loja\\Desktop\\ejemplo2.txt");
        List<Jugador> b = objeto.leerJugadores("C:\\Users\\ist loja\\Desktop\\ejemplo2.txt");
       for (Jugador jugador : b) {
//            System.out.println(jugador.getEdad());
//        }
        System.out.println("el jugador con menor edad es "+objeto.edadmenorObjeto(b).getNombre());
        System.out.println("el juador que mas pronto debuto es "+" "+objeto.debutoP(b).getNombre()+" y su año de debut"+" "+objeto.debutoP(b).getAñoDebut());
        System.out.println("el equipo con mas titulos es;"+" "+objeto.titulos(b).getEquipo().getNombre()+" con; "+" "+objeto.titulos(b).getEquipo().getNumerotitulos()+" "+"titulos");
    }
    }
}