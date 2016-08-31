package classes;

public class Livro {

	String titulo;
	int numeroPaginas;
	
	Livro(String titulo) { //construtor
		//this.titulo = titulo;
		this(titulo, 0);
	}
	
	Livro(int numeroPaginas) {
		//this.numeroPaginas = numeroPaginas;
		this(null, numeroPaginas);
	}
	
	Livro(String titulo, int numeroPaginas) {
		this.titulo = titulo;
		this.numeroPaginas = numeroPaginas;
	}
}