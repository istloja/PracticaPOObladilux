/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjecutarMatematicas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(" 1 suma 2 para resta 3 multiplicacion 4 para division 5 potencia");
        int valor = 0;
        try {
            valor = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("ingrese un numero correcto");
        }

        switch (valor) {
            case 1:
                System.out.println("ingrese dos numero");

                double numero,
                 numero1;
                numero = entrada.nextDouble();
                numero1 = entrada.nextDouble();
                Matematicas objeto = new Matematicas();
                double sumar = objeto.suma(numero, numero1);
                System.out.println(sumar);

                break;
            case 2:
                System.out.println("ingrese dos numero");

                double resta,
                 resta1;
                resta = entrada.nextDouble();
                resta1 = entrada.nextDouble();
                Matematicas objeto1 = new Matematicas();
                double restar = objeto1.resta(resta, resta1);
                System.out.println(restar);

                break;

            case 3:
                System.out.println("ingrese dos numero");

                double mul,
                 mul1;
                mul = entrada.nextDouble();
                mul1 = entrada.nextDouble();
                Matematicas objeto2 = new Matematicas();
                double mult = objeto2.multiplicacion(mul, mul1);
                System.out.println(mult);

                break;

            case 4:
                System.out.println("ingrese 2 numero");
                double d = 0,
                 d1 = 0;

                try {
                    d = entrada.nextDouble();
                    d1 = entrada.nextDouble();

                } catch (Exception e) {
                    System.out.println("ingrese numeros correctos");
                }
                Matematicas objeto3 = new Matematicas();
                double divi = objeto3.division(d, d1);
                System.out.println(divi);
                

                break;
            case 5:
                 System.out.println("ingrese base");

                double p,p2;
                p = entrada.nextDouble();
                System.out.println("ingrese exponenete ");
                p2 = entrada.nextDouble();
                Matematicas objeto4 = new Matematicas();
                double poten = objeto4.potencia(p, p2);
                System.out.println(poten);

                break;
                
                default:
                System.out.println("solo se permite numeros del 1 al 5");
                    

        }
    


        }

    }


