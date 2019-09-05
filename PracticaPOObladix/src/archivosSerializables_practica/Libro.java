/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables_practica;

import archivosSerializables.Jugador;
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
public class Libro  implements Serializable{
     private int nLibro;
    private int nPagina;
    private String nombreLibro;
    private int codlibro;
    private int AñoPublicacion;
    private Autor autor;

    public Libro() {
    }

    public Libro(int nLibro, int nPagina, String nombreLibro, int codlibro, int AñoPublicacion, Autor autor) {
        this.nLibro = nLibro;
        this.nPagina = nPagina;
        this.nombreLibro = nombreLibro;
        this.codlibro = codlibro;
        this.AñoPublicacion = AñoPublicacion;
        this.autor = autor;
    }

    public int getnLibro() {
        return nLibro;
    }

    public void setnLibro(int nLibro) {
        this.nLibro = nLibro;
    }

    public int getnPagina() {
        return nPagina;
    }

    public void setnPagina(int nPagina) {
        this.nPagina = nPagina;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getCodlibro() {
        return codlibro;
    }

    public void setCodlibro(int codlibro) {
        this.codlibro = codlibro;
    }

    public int getAñoPublicacion() {
        return AñoPublicacion;
    }

    public void setAñoPublicacion(int AñoPublicacion) {
        this.AñoPublicacion = AñoPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void escribirLista(String direccion, List<Libro> lista) {
        try {
            ObjectOutputStream escr = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Libro libro : lista) {
                escr.writeObject(libro);
            }
            escr.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }
    public void leerLista(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Libro j1 = (Libro) auxiliar;
            System.out.println(j1.nombreLibro);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     public List<Libro> leerLibros(String url) {

        List<Libro> Lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Libro j1 = (Libro) auxiliar;
                Lista.add(j1);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return Lista;

    }
     
      public Libro libroAntiguo(List<Libro> lista) {
        Libro viejo = lista.get(0);
        for (Libro libro : lista) {
            if (viejo.getAñoPublicacion() > libro.getAñoPublicacion()) {
                viejo = libro;
            }
        }
        return viejo;
    }
      public Libro libroActualizado(List<Libro> lista){
           Libro act = lista.get(0);
        for (Libro libro : lista) {
            if (act.getAñoPublicacion() > 2014) {
                
                act = libro;
                System.out.println(" actualizado "+libro.nombreLibro);
            }
          
            
        }
        return act;
          
      }
      
      


    public static void main(String[] args) {
        Libro objeto = new Libro();
        Libro l1 = new Libro(1, 1, "aventuras", 005, 2019, new Autor("sherlock", "holmes", 4, 5, 2));
        Libro l2 = new Libro(2, 4, "la noche", 004, 2002, new Autor("vicent", "putin", 4, 5, 2));
        Libro l3 = new Libro(3, 5, "pokemon", 007, 2001, new Autor("joel", "luzuriaga", 4, 5, 2));
        Libro l4 = new Libro(4, 6, "el musocal", 006, 2000, new Autor("vladimir", "samaniego", 4, 5, 2));
        Libro l5 = new Libro(5, 9, "el terror", 003, 2020, new Autor("kevin", "Smith", 4, 5, 2));
        List<Libro> Lista = new ArrayList<>();
        Lista.add(l1);
        Lista.add(l2);
        Lista.add(l3);  
        Lista.add(l4);
        Lista.add(l5);

        objeto.escribirLista("C:\\Users\\ist loja\\Desktop\\libro.txt", Lista);
        
        
//         objeto.leerLista("C:\\Users\\ist loja\\Desktop\\libro.txt");
//        List<Libro> b = objeto.leerLibros("C:\\Users\\ist loja\\Desktop\\libro.txt");
//        for (Libro libro : b) {
//         // System.out.println(libro.nombreLibro);
          
            System.out.println("el libro mas antiguo es "+objeto.libroAntiguo(Lista).getNombreLibro());
            System.out.println("esta actualizado"+objeto.libroActualizado(Lista));
          
    }
}



   