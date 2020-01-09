/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.imageio.stream.FileImageOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author its
 */
public class LeeryEscribir {

    public List<Persona> leerPersonas(String url) {
        
            List<Persona> Lista = new ArrayList<Persona>();
            try {
                ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
                Object auxiliar = lector.readObject();
                while (auxiliar != null) {
                    Persona p1 = (Persona) auxiliar;
                    Lista.add(p1);
                    auxiliar = lector.readObject();
                }

            } catch (Exception e) {//
                System.out.println("error"+e);
            }

      
        return Lista;

    }

    public void leerLista(String variable) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(variable));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Persona p1 = (Persona) auxiliar;// cambio de objeto a persona
                System.out.println(p1.getMascota().getNombre() + " su edad es " + p1.getMascota().getEdad());
                auxiliar = lector.readObject();
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }

    public void escribirObjeto(String direccion, Persona p1) {

        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            escritorio.writeObject(p1);                                                                  // input para leer Output para escribir en el objeto
            escritorio.close();
        } catch (Exception e) {
            System.out.println("se produjo un error en " + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Persona p1 = (Persona) auxiliar;
            System.out.println("Dueño: " + p1.getNombre() + " " + "Nombre de la mascota: " + " " + p1.getMascota().getNombre() + " " + "Su edad es: " + p1.getMascota().getEdad());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void escribirLista(String direccion, List<Persona> lista) {
        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Persona persona : lista) {//POR CADA VEZ Q rrecorro la lista creo un objeto de la clase persdona
                escritorio.writeObject(persona);
            }
            escritorio.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }

    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();
        Persona p2 = new Persona("vicente", "luzuriaga", 982369, 20, new Mascota("viche", 3, 4));
        Persona p3 = new Persona("jhoan", "oth", 934, 19, new Mascota("miau", 3, 4));
        Persona p4 = new Persona("luzi", "kawats", 98234, 34, new Mascota("rebeca", 3, 4));
        Persona p5 = new Persona("kevin", "tapia", 982369, 17, new Mascota("akamaru", 3, 4));
        Persona p6 = new Persona("jhoel", "kawai", 982369, 55, new Mascota("vicha1", 3, 4));
        List<Persona> Lista = new ArrayList<>();
        

        Lista.add(p2);
        Lista.add(p4);
        Lista.add(p3);
        Lista.add(p5);
        Lista.add(p6);
        int a = Lista.size();
        System.out.println(a);

        List<Persona> b=objeto.leerPersonas("C:\\Users\\USUARIO\\Desktop\\ejemplo.txt");
        for (Persona persona : b) {
            System.out.println("edades "+ persona.getEdad());
            
        }

    }
}
