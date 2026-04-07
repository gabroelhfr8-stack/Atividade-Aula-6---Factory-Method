public class Main {
    public static void main(String[] args) {
        NotificacaoFactory emailFactory = new EmailFactory();
        NotificacaoFactory smsFactory = new SMSFactory();
        NotificacaoFactory pushFactory = new PushFactory();

        emailFactory.notificar("Mensagem enviada");
        smsFactory.notificar("Seu código de verificação é xx.");
        pushFactory.notificar("Você tem uma nova mensagem.");
    }
}
