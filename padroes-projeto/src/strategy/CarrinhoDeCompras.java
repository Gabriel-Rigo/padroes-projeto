package strategy;

public class CarrinhoDeCompras {
    private EstrategiaDesconto estrategiaDesconto;

    public void setEstrategiaDesconto(EstrategiaDesconto estrategia) {
        this.estrategiaDesconto = estrategia;
    }

    public double calcularValorFinal(double valor) {
        double desconto = estrategiaDesconto.calcularDesconto(valor);
        return valor - desconto;
    }
}
