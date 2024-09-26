package facade;

public class BibliotecaFacade {
    private final CatalogoDeLivros catalogo;
    private final RegistroDeUsuarios registro;
    private final GerenciamentoDeEmprestimos gerenciamento;
    private final Notificacoes notificacoes;

    public BibliotecaFacade() {
        this.catalogo = new CatalogoDeLivros();
        this.registro = new RegistroDeUsuarios();
        this.gerenciamento = new GerenciamentoDeEmprestimos();
        this.notificacoes = new Notificacoes();
    }

    public void buscarELocarLivro(String tituloLivro, String nomeUsuario) {
        catalogo.buscarLivro(tituloLivro);
        gerenciamento.emprestarLivro(tituloLivro, nomeUsuario);
        notificacoes.enviarNotificacao(nomeUsuario, "Você emprestou o livro: " + tituloLivro);
    }

    public void registrarNovoUsuario(String nomeUsuario) {
        registro.registrarUsuario(nomeUsuario);
        notificacoes.enviarNotificacao(nomeUsuario, "Você foi registrado com sucesso!");
    }

    public void devolverLivro(String tituloLivro, String nomeUsuario) {
        System.out.println("Devolvendo o livro: " + tituloLivro + " de " + nomeUsuario);
        notificacoes.enviarNotificacao(nomeUsuario, "Você devolveu o livro: " + tituloLivro);
    }
}
