package SistemaBibliotecaPackage;

public class Livros {

	// Definindo Atributos
	private int id, membroEmprestado, codigoMembro;
	private String titulo, autor;
	private boolean emprestado;
	
	// construtor
	public Livros(int id, String titulo, String autor, int codigoMembro) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.emprestado = false;
		this.setCodigoMembro(codigoMembro);
	}
	
	public Livros() {
		
	}
	
	public boolean isEmprestado() {
		return emprestado;
	}
	
	public void emprestar(int membroId) {
		emprestado = true;
		setMembroEmprestado(membroId);
	}
	
	public void devolver() {
		emprestado = false;
		setMembroEmprestado(-1);
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getMembroEmprestado() {
		return membroEmprestado;
	}

	public void setMembroEmprestado(int membroEmprestado) {
		this.membroEmprestado = membroEmprestado;
	}

	public int getCodigoMembro() {
		return codigoMembro;
	}

	public void setCodigoMembro(int codigoMembro) {
		this.codigoMembro = codigoMembro;
	}
	 
	
	
	
	
}
