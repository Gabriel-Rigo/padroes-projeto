package decorator;

public class AppNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação pelo app: " + mensagem);
    }
}
