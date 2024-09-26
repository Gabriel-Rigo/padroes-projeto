package facade;

public class Notificacoes {
    public void enviarNotificacao(String usuario, String mensagem) {
        System.out.println("Notificando " + usuario + ": " + mensagem);
    }
}
