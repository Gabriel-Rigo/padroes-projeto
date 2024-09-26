package observer;

public class Jornalista implements Observer {
    @Override
    public void atualizar(String noticia) {
        System.out.println("Jornalista recebeu a notícia: " + noticia);
    }
}
