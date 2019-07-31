/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import java.util.Scanner;

/**
 *
 * @author ist loja
 */
public class Practicaexepciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" 1 suma 2 para resta 3 multiplicacion 4 para division");
        int valor = 0;
        try {
            valor = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("ingrse un numero correcto");
        }
        switch (valor) {
            case 1:
                System.out.println("ingrese dos numero");

                double valor1,
                 valor2,
                 resultado = 0;
                try {

                    valor1 = entrada.nextDouble();
                    valor2 = entrada.nextDouble();
                    resultado = valor1 + valor2;
                    System.out.println("el resultado es " + resultado);
                } catch (Exception e) {
                    System.out.println("ingrse numeros correctos");
                }
                break;
            case 2:
                System.out.println("ingrese dos numero");

                double valor11,
                 valor22;
                try {

                    valor11 = entrada.nextDouble();
                    valor22 = entrada.nextDouble();
                    resultado = valor11 - valor22;
                    System.out.println("el resultado es " + resultado);
                } catch (Exception e) {
                    System.out.println("ingrese numeros correctos");
                }
                break;
            case 3:

                System.out.println("ingrse 2 numero");
                double valor111,
                 valor222;
                try {

                    valor111 = entrada.nextDouble();
                    valor222 = entrada.nextDouble();
                    resultado = valor111 * valor222;
                    System.out.println("el resultado es " + resultado);
                } catch (Exception e) {
                    System.out.println("ingrse numeros correctos");
                }
                break;
            case 4:
                System.out.println("ingrse 2 numero");

                try {

                    double valor1111 = entrada.nextDouble();
                    double valor2222 = entrada.nextDouble();

                    double resultado1 = valor1111 / valor2222;
                    System.out.println("el resultado es" + resultado1);
                } catch (Exception e) {
                    System.out.println("ingrese numeros correctos");

                    break;

                }
            default:
                System.out.println("solo se permite numeros del 1 al 4");
        }

    }

}

