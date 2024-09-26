package decorator;

public class Main {
    public static void main(String[] args) {
        Notificacao email = new EmailNotificacao();
        Notificacao sms = new SMSNotificacao();

        Notificacao emailComCriptografia = new CriptografiaDecorator(email);
        Notificacao emailComLog = new LogAuditoriaDecorator(emailComCriptografia);

        emailComLog.enviar("Olá, esta é uma mensagem de teste.");
        sms.enviar("Olá, esta é uma mensagem de teste SMS.");
    }
}
