package SistemaBibliotecaPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


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
	
	@Test
	void testDevolverLivro() {
		livro.emprestar(1);
        assertTrue(livro.isEmprestado());
        livro.devolver();
        assertFalse(livro.isEmprestado());
	}

}

