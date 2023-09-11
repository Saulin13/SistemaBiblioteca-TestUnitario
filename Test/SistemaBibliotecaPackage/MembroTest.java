import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import SistemaBibliotecaPackage.Livros;
import SistemaBibliotecaPackage.Membro;

class MembroTest {
	
	Membro membro= new Membro(1, "Test");
	

	@Test
	void testCriarMembro() {
		assertEquals(1, membro.getId());
		 assertEquals("Test", membro.getNome());
	}
	
	 @Test
	    public void testMembroPegaEmprestado() {
		   Livros livro = new Livros( 1 , "Test", "Test2");
	        
	        membro.membroPegaEmprestado(livro);
	        
	        assertTrue(livro.isEmprestado());
	    }
	
	@Test
        public void testMembroRetornaLivro() {
             Livros livro = new Livros( 1 , "Test", "Test2");

            membro.membroPegaEmprestado(livro);
            membro.membroRetornaLivro(livro);

            assertFalse(livro.isEmprestado());
        }

}