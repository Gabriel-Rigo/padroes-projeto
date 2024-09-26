package strategy;

public class DescontoQuantidade implements EstrategiaDesconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.1; // 10% de desconto
    }
}
