import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Biblioteca.Biblioteca;
import Biblioteca.Livros;

class BibliotecaTest {

	private static final String Livros = null;
	Biblioteca biblioteca = new Biblioteca();
	
	@Test
	void testRegistrarLivro() {
        Livros livro = new Livros(1, "Autor1", "Livro1");
        biblioteca.registrarLivro(livro);
        assertTrue(biblioteca.armazenamento.contains(livro));}
	
	@Test
	void testEmprestarLivroParaMembro() {
        Livros livro = new Livros(1, "Autor1", "Livro1");
        biblioteca.registrarLivro(livro);
        biblioteca.emprestarLivro(1, 123); 
        assertTrue(biblioteca.livrosEmprestados.contains(livro));
    }
	
	
}
