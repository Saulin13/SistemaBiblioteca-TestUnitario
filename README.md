ATIVIDADE
 

Temos um sistema de biblioteca da PUC MG e queremos testar esse sistema.   Imagine um sistema básico de biblioteca que permite registrar livros, emprestar livros para membros e retornar livros.

Classes Principais:

Livro: Tem atributos como id, titulo, autor e emprestado.
Membro: Tem atributos como id, nome e livrosEmprestados.
Biblioteca: Tem métodos para registrarLivro(Livro livro), emprestarLivro(int livroId, int membroId) e retornarLivro(int livroId, int membroId).
Instruções:
Preparação:

Configure seu ambiente de desenvolvimento com JUnit.
Implemente as classes Livro, Membro e Biblioteca conforme descrito no contexto.
Desenvolvimento dos Casos de Teste:

2.1. Classe LivroTest:

testCriarLivro(): Verifique se um livro pode ser criado corretamente.
testEmprestarLivro(): Verifique se o status de um livro pode ser alterado para emprestado.
testRetornarLivro(): Verifique se o status de um livro pode ser alterado para não emprestado.
2.2. Classe MembroTest:

testCriarMembro(): Verifique se um membro pode ser criado corretamente.
testMembroPegaEmprestado(): Verifique se um livro é adicionado à lista de livros emprestados de um membro após o empréstimo.
testMembroRetornaLivro(): Verifique se um livro é removido da lista de livros emprestados de um membro após a devolução.
2.3. Classe BibliotecaTest:

testRegistrarLivro(): Verifique se um livro é adicionado corretamente à lista de livros da biblioteca.
testEmprestarLivroParaMembro(): Verifique se um livro pode ser emprestado a um membro.
testRetornarLivroDeMembro(): Verifique se um livro pode ser devolvido por um membro.
testEmprestarLivroNaoDisponivel(): Verifique o que acontece quando tenta-se emprestar um livro que já está emprestado.
Refatoração:

Com base nos testes que você escreveu, refatore o código se necessário para melhorar sua qualidade e manutenibilidade, garantindo que os testes ainda passem após as alterações.

Dicas:

Lembre-se de usar as asserções adequadas do JUnit para validar os cenários.
Mantenha seus métodos de teste pequenos e focalizados em um único aspecto do comportamento.
Não hesite em adicionar mais métodos de teste se achar que algum cenário não está sendo coberto.
Avaliação:

Os alunos serão avaliados com base na completude e precisão de seus testes, bem como na qualidade de seu código.
