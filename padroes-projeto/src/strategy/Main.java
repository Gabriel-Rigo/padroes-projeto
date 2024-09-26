package strategy;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.setEstrategiaDesconto(new DescontoQuantidade());
        System.out.println("Valor final com desconto de quantidade: " + carrinho.calcularValorFinal(100.0));

        carrinho.setEstrategiaDesconto(new DescontoTemporada());
        System.out.println("Valor final com desconto de temporada: " + carrinho.calcularValorFinal(100.0));

        carrinho.setEstrategiaDesconto(new DescontoMembroVIP());
        System.out.println("Valor final com desconto de membro VIP: " + carrinho.calcularValorFinal(100.0));
    }
}
