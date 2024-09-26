package strategy;

public class DescontoMembroVIP implements EstrategiaDesconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.3; // 30% de desconto
    }
}
