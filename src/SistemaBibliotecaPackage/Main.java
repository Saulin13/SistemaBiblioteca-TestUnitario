package Biblioteca;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

			 

	    	Random random = new Random();
	    	Biblioteca biblioteca = new Biblioteca();
	        Scanner input = new Scanner(System.in);
	        
	        String tilt, author;
	   	    int codigoMember = random.nextInt(100);

	        int opc = 999;
	         while(opc!=5) {
				 System.out.println("0 - Cadastrar Usuario");
	        	 System.out.println("1 - Registrar Livros");
	        	 System.out.println("2 - Listar Livros");
	        	 System.out.println("3 - Alugar Livro");
	        	 System.out.println("4 - Devolver Livro");
				 System.out.println("5 - Sair do sistema");
	        	 System.out.println("Digite a Opcao Que Deseja: ");
	             opc = input.nextInt();	
	             input.nextLine();
	             switch(opc) {
					case 0: 
					System.out.println("Digite seu nome: ");
					String nomeUsuario = input.nextLine();
					codigoMember++;
	            	 System.out.println("Seu Codigo No Sistema: " + codigoMember);
					 Membro membro  = new Membro(codigoMember, nomeUsuario);
					 System.out.println("Registrado com sucesso no sistema: " + nomeUsuario + ", Seu codigo: " + codigoMember);


					break;
	             case 1: 
	            	 System.out.println("\nDigite o Titulo Do Livro: ");
	            	 tilt = input.nextLine();
	            	 System.out.println("\nDigite o Autor Do Livro: ");
	            	 author = input.nextLine();
	            	 int id = random.nextInt(100);
	            	 
	            	  Livros livro = new Livros(id,tilt,author);
	            	 biblioteca.registrarLivro(livro);
	            	 
	            	 break;
	             case 2: 
	            	 System.out.println("\nLista de Livros: ");
	            	 for(Livros livroAux : biblioteca.armazenamento) {
	            		 biblioteca.imprimirLivros(livroAux);
	            	 }
	            	 break;
	             case 3:
	            	 System.out.println("\nAlugando Livro");
	            	 System.out.println("Digite o Codigo Do Livro: ");
	            	 id = input.nextInt();
	            	 System.out.println("Digite o Seu Codigo Do Sistema: ");
	            	 codigoMember = input.nextInt();
	            	 
	                biblioteca.emprestarLivro(id, codigoMember);            	 
	             break;
	             case 4:
	            	 System.out.println("\nDevolvendo Livro");
	            	 System.out.println("Digite o Codigo Do Livro: ");
	            	 id = input.nextInt();
	            	 System.out.println("Digite o Seu Codigo Do Sistema: ");
	            	 codigoMember = input.nextInt();
	            	 
	                biblioteca.retornarLivro(id, codigoMember);            	 
	             break;
	             }
	         }
	        
	        
	        
	//
//	        Livros primeiroLivro = new Livros(1, "Diario De Um Banana", "Caio Ameno");
//	        Livros segundoLivro = new Livros(2, "Homem De Ferro", "Marvel");
	//
//	        biblioteca.registrarLivro(primeiroLivro);
//	        biblioteca.registrarLivro(segundoLivro);
	//
//	        biblioteca.imprimirLivros(primeiroLivro);
//	        biblioteca.imprimirLivros(segundoLivro);
	//
//	        biblioteca.emprestarLivro(1, 101);        
//	        biblioteca.retornarLivro(1, 101);
//	        
//	        biblioteca.buscarLivros(1);
//	      
	}
	    }
