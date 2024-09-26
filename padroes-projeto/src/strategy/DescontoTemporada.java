package strategy;

public class DescontoTemporada implements EstrategiaDesconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.2; // 20% de desconto
    }
}
