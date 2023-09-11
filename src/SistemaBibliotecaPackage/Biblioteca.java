package SistemaBibliotecaPackage;
import java.util.Scanner;

import Biblioteca.Livros;

import java.util.Random;
import java.util.ArrayList;

public class Biblioteca {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    String autor, tituloLivro;

    public ArrayList<Livros> armazenamento = new ArrayList<Livros>();
    public ArrayList<Livros> livrosEmprestados = new ArrayList<Livros>();

    public void registrarLivro(Livros Livro) {
        armazenamento.add(Livro);
        System.out.println("Livro Registrado Com Sucesso");
    }

    public void emprestarLivro(int livroId, int membroId) {
        Livros livro = buscarLivros(livroId);

        if (livro != null && !livro.isEmprestado()) {
            livro.emprestar(membroId);
            livrosEmprestados.add(livro);
            System.out.println("\nLivro emprestado com sucesso");
        } else {
            System.out.println("Livro nao disponivel");
        }
    }

    public void retornarLivro(int livroId, int membroId) {
        Livros livro = buscarLivros(livroId);

        if (livro != null && livro.getMembroEmprestado() == membroId) {
            livro.devolver();
            livrosEmprestados.remove(livro);
            System.out.println("Livro devolvido com sucesso");
        } else {
            System.out.println("Livro nao esta com esse membro");
        }
    }
    

    public Livros buscarLivros(int livroId) {
        for (Livros livro : armazenamento) {
            if (livro.getId() == livroId) {
            	
                return livro;
            }
        }
        return null;
    }
    
    public void imprimirLivros(Livros livro) {
        System.out.println("Titulo: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Codigo: " + livro.getId()+ ", Codigo Do Membro: "+ livro.getCodigoMembro());
    }
}
