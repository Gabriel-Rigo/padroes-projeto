package facade;

public class Main {
    public static void main(String[] args) {
        BibliotecaFacade biblioteca = new BibliotecaFacade();
        biblioteca.registrarNovoUsuario("João");
        biblioteca.buscarELocarLivro("O Senhor dos Anéis", "João");
        biblioteca.devolverLivro("O Senhor dos Anéis", "João");
    }
}
