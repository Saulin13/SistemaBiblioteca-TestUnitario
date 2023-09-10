import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Biblioteca.Livros;

class LivrosTest {

	Livros livro = new Livros( 1 , "Test", "Test2", 2);
	
	
	
	@Test
	void testCriarLivro() {
		  assertEquals(1, livro.getId());
		  assertEquals("Test", livro.getTitulo());
		  assertEquals("Test2", livro.getAutor());
		  assertEquals(2, livro.getCodigoMembro());
	}
	
	@Test
	void testEmprestarLivro() {
		livro.emprestar(1);
		 assertEquals(true, livro.isEmprestado());
		
	}

}

