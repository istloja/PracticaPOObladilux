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
import sun.security.util.Length;

/**
 *
 * @author its
 */
public class Jugador implements Serializable {

    private int perdidas_balon;
    private int asistencias;
    private double km_recorridos;
    private int pases_completados;
    private int fallos_gol;

    private String nombre;

    private String apellido;

    private int edad;

    private int numeroGoles;

    private int añoDebut;

    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(int perdidas_balon, int asistencias, double km_recorridos, int pases_completados, int fallos_gol, String nombre, String apellido, int edad, int numeroGoles, int añoDebut, Equipo equipo) {
        this.perdidas_balon = perdidas_balon;
        this.asistencias = asistencias;
        this.km_recorridos = km_recorridos;
        this.pases_completados = pases_completados;
        this.fallos_gol = fallos_gol;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
        this.añoDebut = añoDebut;
        this.equipo = equipo;
    }

    public int getPerdidas_balon() {
        return perdidas_balon;
    }

    public void setPerdidas_balon(int perdidas_balon) {
        this.perdidas_balon = perdidas_balon;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public double getKm_recorridos() {
        return km_recorridos;
    }

    public void setKm_recorridos(double km_recorridos) {
        this.km_recorridos = km_recorridos;
    }

    public int getPases_completados() {
        return pases_completados;
    }

    public void setPases_completados(int pases_completados) {
        this.pases_completados = pases_completados;
    }

    public int getFallos_gol() {
        return fallos_gol;
    }

    public void setFallos_gol(int fallos_gol) {
        this.fallos_gol = fallos_gol;
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

    //
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

    public int nombreMascaracteres(Jugador jugador) {
        return jugador.getNombre().length() + jugador.getApellido().length();

    }

    public Jugador jugadorMascaracteres(List<Jugador> lista) {
        Jugador mayorcaracteres = lista.get(0);
        for (Jugador jugador : lista) {
            if (nombreMascaracteres(jugador) > nombreMascaracteres(mayorcaracteres)) {

                mayorcaracteres = jugador;

            }

        }
        return mayorcaracteres;
    }

    public Jugador jugadorMenoscaracteres(List<Jugador> lista) {
        Jugador mayorcaracteres = lista.get(0);
        for (Jugador jugador : lista) {
            if (nombreMascaracteres(jugador) < nombreMascaracteres(mayorcaracteres)) {

                mayorcaracteres = jugador;

            }

        }
        return mayorcaracteres;
    }

    public double porcentajeAcierto(Jugador jugadorpro) {
        return (jugadorpro.getNumeroGoles() + jugadorpro.getAsistencias()) / jugadorpro.getFallos_gol();

    }

    public double porcentajeEfectividad(Jugador jugadorfec) {
        return (jugadorfec.getPases_completados() / jugadorfec.getPerdidas_balon());
    }

    public double porcentajeEficenciaJugagor(Jugador jugadorefici) {
        return (porcentajeAcierto(jugadorefici) + porcentajeEfectividad(jugadorefici) + jugadorefici.getKm_recorridos());
    }

    public Jugador mayorEfectividad(List<Jugador> lista) {
        Jugador mayorefectividad = lista.get(0);
        for (Jugador jugador : lista) {
            if (porcentajeEfectividad(jugador) > porcentajeEfectividad(mayorefectividad)) {
                mayorefectividad = jugador;

            }
        }

        return mayorefectividad;
    }

    public Jugador mayorEficiencia(List<Jugador> lista) {
        Jugador mayorAcierto = lista.get(0);
        for (Jugador jugador : lista) {
            if (porcentajeEficenciaJugagor(jugador) > porcentajeEficenciaJugagor(mayorAcierto)) {
                mayorAcierto = jugador;

            }
        }

        return mayorAcierto;
    }

    public Jugador mayorAcierto(List<Jugador> lista) {
        Jugador mayoreAcierto = lista.get(0);
        for (Jugador jugador : lista) {
            if (porcentajeAcierto(jugador) > porcentajeAcierto(mayoreAcierto)) {
                mayoreAcierto = jugador;

            }
        }

        return mayoreAcierto;
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

//    public Jugador equipoMasjugadores(List<Jugador> lista){
//        
//        
//    }

    public static void main(String[] args) {
        Jugador objeto = new Jugador();
        //(int perdidas_balon, int asistencias, double km_recorridos, int pases_completados, int fallos_gol, String nombre, String apellido, int edad, int numeroGoles, int añoDebut, Equipo equipo)
        Jugador j1 = new Jugador(6, 3, 4.4, 39, 3, "Cristiano", "Ronaldo", 33, 520, 2005, new Equipo("juventus", 20, "Turin"));
        Jugador j2 = new Jugador(8, 5, 5.6, 56, 2, "Lionel", "Messi", 31, 600, 2001, new Equipo("Barcelona", 30, "Barcelona"));
        Jugador j3 = new Jugador(8, 5, 7.8, 78, 4, "Neimarar", "Jr", 28, 200, 2011, new Equipo("PSG", 10, "Paris"));
        Jugador j4 = new Jugador(8, 3, 6.7, 67, 3, "eden", "Hazgut", 27, 1590, 2010, new Equipo("Real Madrid", 40, "Madrid"));
        Jugador j5 = new Jugador(8, 3, 6.7, 67, 3, "Fabricio", "Colomb", 27, 1590, 2010, new Equipo("Juventus", 40, "Madrid"));
        Jugador j6 = new Jugador(8, 3, 6.7, 67, 3, "Manuela", "Putin", 27, 1590, 2010, new Equipo("Real Madrid", 40, "Barcelona"));
        Jugador j7 = new Jugador(8, 3, 6.7, 67, 3, "Kevin", "man", 27, 1590, 2010, new Equipo("PSG", 40, "Madrid"));
        Jugador j8 = new Jugador(8, 3, 6.7, 67, 3, "Angel", "Hazgut", 27, 1590, 2010, new Equipo("Real Madrid", 40, "Madrid"));
        Jugador j9 = new Jugador(8, 3, 6.7, 67, 3, "Arnol", "Mar", 27, 1590, 2010, new Equipo("Barcelona", 40, "Madrid"));
        Jugador j10 = new Jugador(8, 3, 6.7, 67, 3, "Vicente", "Roca", 27, 1590, 2010, new Equipo("Juventus", 40, "Madrid"));

        List<Jugador> Lista = new ArrayList<>();

        Lista.add(j1);
        Lista.add(j2);
        Lista.add(j3);
        Lista.add(j4);
        Lista.add(j5);
        Lista.add(j6);
        Lista.add(j7);
        Lista.add(j8);
        Lista.add(j9);
        Lista.add(j10);
        int a = Lista.size();//guardo en la variable a esta me permite saber el tamaño de lista (.size())
        System.out.println(a);
        objeto.escribirLista("C:\\Users\\ist loja\\Desktop\\ejemplo2.txt", Lista);
        objeto.leerLista("C:\\Users\\ist loja\\Desktop\\ejemplo2.txt");
        List<Jugador> b = objeto.leerJugadores("C:\\Users\\ist loja\\Desktop\\ejemplo2.txt");
        for (Jugador jugador : b) {
//            System.out.println(jugador.getEdad());
//        }
            System.out.println("el jugador con menor edad es " + objeto.edadmenorObjeto(b).getNombre());
            System.out.println("el juador que mas pronto debuto es " + " " + objeto.debutoP(b).getNombre() + " y su año de debut" + " " + objeto.debutoP(b).getAñoDebut());
            System.out.println("el equipo con mas titulos es;" + " " + objeto.titulos(b).getEquipo().getNombre() + " con; " + " " + objeto.titulos(b).getEquipo().getNumerotitulos() + " " + "titulos");
            System.out.println("EL JUGADOR MAS eficiencia ES " + objeto.mayorEficiencia(b).getNombre());
            System.out.println("EL JUGADOR MAS acierto ES" + objeto.mayorAcierto(b).getNombre());
            System.out.println("EL JUGADOR MAS efectividad ES" + objeto.mayorEfectividad(b).getNombre());
            System.out.println("jugador con menos caracteres " + objeto.jugadorMenoscaracteres(Lista).getNombre() + " " + objeto.jugadorMenoscaracteres(Lista).getApellido());
            System.out.println("jugador con mas caracteres " + objeto.jugadorMascaracteres(Lista).getNombre() + " " + objeto.jugadorMascaracteres(Lista).getApellido());

        }
    }
}
