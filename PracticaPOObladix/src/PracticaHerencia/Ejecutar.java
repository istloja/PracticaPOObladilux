/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaHerencia;

import java.util.Scanner;

/**
 *
 * @author ist loja
 */
public class Ejecutar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(" Seleccione 1 para circulo 2 triangulo 3 para cuadrado");
        int valor= entrada.nextInt();
        switch (valor){//es como un if pero diferente es universal
            case 1:// opcion
                System.out.println("Es un circulo");
                double radio=entrada.nextDouble();// creo un objeto
                Circulo objeto=new Circulo();//
                
                double areacirculo=objeto.calcularArea(radio);// llamo alas variables de la clase cierculo  area
                
                double perimetroCirculo=objeto.calcularPerimetro(radio);// perimetro
                
                System.out.println("este es area"+ areacirculo+" este e4s el perimetro"+perimetroCirculo);
                break;// siempre para detener despues de cada case
                
                
            case 2:
                System.out.println("es un triangulo");
                System.out.println("ingrese el lado 1");
                double lado1=entrada.nextDouble();// creo un objeto
                System.out.println("ingrese el lado 2");
                double lado2=entrada.nextDouble();
                System.out.println("ingrese el lado 3");
                double lado3=entrada.nextDouble();
                System.out.println("ingrese la base");
                double base=entrada.nextDouble();
                System.out.println("ingrese la altura");
                double altura=entrada.nextDouble();
                
                Triangulo objeto1=new Triangulo();//
                
                double areatriangulo=objeto1.calcularArea(base,altura);// llamo alas variables de la clase cierculo  area
                
                double perimetrotriangulo=objeto1.calcularPerimetro(lado1,lado2,lado3);// perimetro
                
                System.out.println("este es area"+areatriangulo+" este es el perimetro"+perimetrotriangulo);
                
                break;
            case 3:
                System.out.println("es un cuadrado");
                System.out.println("ingrese el lado");
                
                double lado=entrada.nextDouble();// creo un objeto
                Cuadrado objeto2=new Cuadrado();//
                
                double areacuadrado=objeto2.calcularArea(lado);
                double perimetrocuadrado=objeto2.calcularPerimetro(lado);
                System.out.println("este es area"+areacuadrado+" este es el perimetro"+perimetrocuadrado);
                
                break;// para detener
            case 4:
                System.out.println("ingrese la longitud del cubo");
                 double cubo=entrada.nextDouble();
                 System.out.println("ingrese el volumen");
                 double volumen=entrada.nextDouble();
                Cubo objeto4 = new Cubo();
                double calcularlongitud=objeto4.calcularlongitudcubo(cubo);
                        
                double calcularvolumencubo=objeto4.calcularvolumencubo(volumen);
                System.out.println("longitud"+calcularlongitud+"volumen"+calcularvolumencubo);
                break;
            case 5:
                System.out.println("ingrese el radio para la esfera");
                double radioes=entrada.nextDouble();
                
                
               
                 Esfera objeto5 = new Esfera();
                 
                double calcularradio=objeto5.calcularRadio(radioes);
                double calcularvolumen=objeto5.calcularVolumen(radioes);
                System.out.println("radio"+calcularradio+"volumen"+calcularvolumen);
                break;
           
               
            case 6:
                System.out.println("ingrese valor para el area");
                double ladotetra=entrada.nextDouble();
                System.out.println("ingrese la arista");
                double aristas=entrada.nextDouble();
                
                Tetaedro objeto6=new Tetaedro();
                
                double calcularaereatetra=objeto6.calcularAREA(ladotetra);
                double calcularvolumentetra=objeto6.calcularVOLUMEN(aristas);
                System.out.println("areatetraedro"+calcularaereatetra+"volumen del tetraedro"+calcularvolumentetra);
                break;
                
                 default:   //no escojemos nimgun valor 
                System.out.println("ingrese un numero correcto");
                     break;
                
                
        }
        
    }
    
}
    
           