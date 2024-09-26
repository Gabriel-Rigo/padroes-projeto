package observer;

public class Leitor implements Observer {
    @Override
    public void atualizar(String noticia) {
        System.out.println("Leitor recebeu a notícia: " + noticia);
    }
}
