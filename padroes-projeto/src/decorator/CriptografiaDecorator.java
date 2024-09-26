package decorator;

public class CriptografiaDecorator extends NotificacaoDecorator {
    public CriptografiaDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        mensagem = "Mensagem Criptografada: " + mensagem;
        super.enviar(mensagem);
    }
}
