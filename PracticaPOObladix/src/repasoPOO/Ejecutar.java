/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoPOO;

/**
 *
 * @author ist loja
 */
public class Ejecutar {
    public static void main(String[] args) {// creamos tres objetos e imprimimos
        //de manera rapida con el constructor
        Animales objeto=new Animales("jirafa",12.3,3.5,"amarilla",23.2);
        Aves objeto1=new Aves(2,false,"pata",2,3.0,"blanca",1.2);
        Maniferos objeto2=new Maniferos (1,true,"vaca",5,500,"blanca con negro",2.0);
        Reptiles objeto3=new Reptiles (true,"carne","iguana",2,3,"verde",0.23);
        Anfibios objeto4=new Anfibios (true,"lisa","sapo",1,1.2,"verde claro",0.3);
                // public Anfibios(boolean nada, String piel, String nombre, double edad, double peso, String color, double altutra) {
        // 
        System.out.println(objeto.infoAnimal());
        System.out.println(objeto1.infoAnimal());
        System.out.println(objeto2.infoAnimal());
        System.out.println(objeto3.infoAnimal());
        System.out.println(objeto4.infoAnimal());
        
    }
    
}
