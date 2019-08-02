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
public class libro {
    	private int ISBN;
	private String titulo;
	private String autor;
	private int numPagi;
	
	
	/**
	 * @param iSBN
	 * @param titulo
	 * @param autor
	 * @param numPagi
	 */
	public libro(int iSBN, String titulo, String autor, int numPagi) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPagi = numPagi;
	}
	
	/**
	 * @return el iSBN
	 */
	public int getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN el iSBN a establecer
	 */
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	/**
	 * @return el titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo el titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return el autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor el autor a establecer
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return el numPagi
	 */
	public int getNumPagi() {
		return numPagi;
	}
	/**
	 * @param numPagi el numPagi a establecer
	 */
	public void setNumPagi(int numPagi) {
		this.numPagi = numPagi;
	}

	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "El libro ISBN " + ISBN + ", titulo " + titulo + ", creado por el autor " + autor + ",tiene " + numPagi + " paginas";
	}
	
	
	
	
	
}

