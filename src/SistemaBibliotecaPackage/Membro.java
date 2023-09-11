package SistemaBibliotecaPackage;

import java.util.ArrayList;

public class Membro {

	private int id;
	private String nome;
	public ArrayList<Livros> livrosEmprestados = new ArrayList<Livros>();
	
	
	//Construtor Membro
	public Membro(int id, String nome) {
		this.id = id;
		this.nome = nome;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void membroPegaEmprestado(Livros livro) {
        if (livro != null && !livro.isEmprestado()) {
            livro.emprestar(id);
            livrosEmprestados.add(livro);
        }
    }

	public void membroRetornaLivro(Livros livro) {
        if (livro != null && livro.isEmprestado()) {
            livro.devolver();
            livrosEmprestados.remove(livro);
        }
    }
	
	
}