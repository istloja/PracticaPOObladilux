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
public class Ejecutar {

    public static void main(String[] args) {
        Deportes objeto = new Deportes(90, "Juan carlos ceriani", 1907, "Montevideo", "futbol");
        Individuales objeto1 = new Individuales(1, "ambiente tranquilo", "no hacer trampa", 22, "piezas", 90, "anonimo", 1851, "Asia", "Ajedrez");
        Individuales objeto2 = new Individuales(1, "campo", "no hacer trampa", 15, "palo", 0, "royal burgess", 1735, "Edimburgo", "Golf");
        Individuales objeto3 = new Individuales(1, "pista", "no hacer trampa", 0, "bicicletas", 0, "anonimo", 1987, "egipto", "ciclismo");
        Individuales objeto4 = new Individuales(1, "coliseo", "no hacer trampa", 0, "lanza", 0, "anonimo", 708, "grecia", "jabalina");
        Individuales objeto5 = new Individuales(1, "pista", "no hacer trampa", 0, "motocicleta", 0, "anonimo", 1885, "Gottlieb Daimler", "motociclismo");
        Equipos objeto6 = new Equipos(12, 2, true, "rojo", "balon", 40, "james naismith", 1891, "springfield", "basketball");
        Equipos objeto7 = new Equipos(11, 2, true, "azul", "balon", 60, "walter camp", 1920, "nueva york", "football americano");
        Equipos objeto8 = new Equipos(6, 2, true, "verde", "balon", 0, "anonimo", 1960, "", "voleyball");
        Equipos objeto9 = new Equipos(9, 2, true, "blanco", "balon", 0, "Abner Doubleday", 1861, "nueva york", "beisbol");
        Equipos objeto10 = new Equipos(15, 2, true, "negro", "balon", 80, "anonimo", 1800, "Rugby", "rugby");
        System.out.println(objeto.detalleEquipo());
        System.out.println(objeto1.detalleEquipo());
        System.out.println(objeto2.detalleEquipo());
        System.out.println(objeto3.detalleEquipo());
        System.out.println(objeto4.detalleEquipo());
        System.out.println(objeto5.detalleEquipo());
        System.out.println(objeto6.detalleEquipo());
        System.out.println(objeto7.detalleEquipo());
        System.out.println(objeto8.detalleEquipo());
        System.out.println(objeto9.detalleEquipo());
        System.out.println(objeto10.detalleEquipo());
    }
}