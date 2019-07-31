/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Previo;

/**
 *
 * @author ISTLOJA12
 */
public class LibroLeido {
    	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		libro l1 = new libro(1, "la culpa de la vaca", "Jaime Lopera Gutiérrez", 300);
		libro l2 = new libro(10,"Harry Potter","J. K. Rowling y rowli ng j.k.",1200);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		if (l1.getNumPagi()>l2.getNumPagi()) {
			System.out.println("El libro "+l1.getTitulo()+" tiene mas numeros de paginas que el libro "+l2.getTitulo());
		}else {
			System.out.println("El libro "+l2.getTitulo()+" tiene mas numeros de paginas que el libro "+l1.getTitulo());
		}
		

	}

}


