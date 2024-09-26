package decorator;

public class LogAuditoriaDecorator extends NotificacaoDecorator {
    public LogAuditoriaDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Log: Enviando notificação...");
        super.enviar(mensagem);
    }
}
