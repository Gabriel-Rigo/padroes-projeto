package observer;

public class Main {
    public static void main(String[] args) {
        Noticia noticia = new Noticia();
        Leitor leitor1 = new Leitor();
        Jornalista jornalista1 = new Jornalista();

        noticia.adicionarObservador(leitor1);
        noticia.adicionarObservador(jornalista1);

        noticia.publicar("Nova notícia sobre design patterns!");
    }
}
