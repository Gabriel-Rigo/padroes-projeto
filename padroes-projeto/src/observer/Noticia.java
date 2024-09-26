package observer;

import java.util.ArrayList;
import java.util.List;

public class Noticia {
    private final List<Observer> observadores = new ArrayList<>();
    private String conteudo;

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(conteudo);
        }
    }

    public void publicar(String conteudo) {
        this.conteudo = conteudo;
        notificarObservadores();
    }

    void adicionarObservador(Leitor leitor1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
