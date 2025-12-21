import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<User> usuarios = new ArrayList<>();
    private List<Bookl> livros = new ArrayList<>();
    private List<Loan> emprestimos = new ArrayList<>();

    public void addUser(User usuario){
        if (!usuarios.contains(usuario)){
            usuarios.add(usuario);
        }
    }
    public void removeUser(User usuario){
        if (usuarios.contains(usuario)){
            usuarios.remove(usuario);
        }
    }

    public void addBook(Bookl livro){
        if (!livros.contains(livro)){
            livros.add(livro);
        }
    }
    public void removeBook(Bookl livro){
        if (livros.contains(livro)){
            livros.remove(livro);
        }
    }
    public void listBooks(){
        for (Bookl g: livros){
            System.out.printf("%d. %s - %s\n", livros.indexOf(g) + 1, g.getTitulo(), g.getAuthor());
        }
    }
    public void findByTitle(String titulo){
        int contador = 0;
        System.out.printf("Livros com o nome '%s': \n",titulo);
        for (Bookl g: livros){
            if (g.getTitulo().equalsIgnoreCase(titulo)){
                System.out.printf("%s. %s - %s\n", g.getID(), g.getTitulo(), g.getAuthor());
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("Não encontrado.");
        }
    }
    public void findByCategory(String categoria){
        int contador = 0;
        System.out.println(categoria + ": ");
        for (Bookl g: livros){
            if (g.getCategoria().equalsIgnoreCase(categoria)){
                System.out.printf("%s. %s - %s\n", g.getID(), g.getTitulo(), g.getAuthor());
                contador ++;
            }
        }
        if (contador == 0){
            System.out.println("Não encontrado.");
        }

    }

    public void emprestar(User usuario, Bookl livro){
        boolean ta = false;
        for (Loan em: emprestimos){
            System.out.println("Verificando...");
                if (em.getLivro().getID().equals(livro.getID())){
                    if (em.isAtivo()){
                        ta = true;
                    }
                }
            }
        if (!ta){
            if (livros.contains(livro) && usuarios.contains(usuario)){
                Loan emprestimo = new Loan(usuario, livro);
                emprestimos.add(emprestimo);
            }
        }
    }
    public void devolver(User usuario, Bookl livro){
        for (Loan em: emprestimos){
            if (em.getLivro().getID().equals(livro.getID())){
                if (em.isAtivo()){
                    if (livros.contains(livro) && usuarios.contains(usuario)){
                        em.devolver();
                    }
                }
            }
        }
    }
}
