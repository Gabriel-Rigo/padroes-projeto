package builder;

public class Sanduiche {
    private String pao;
    private String carne;
    private String queijo;
    private boolean alface;
    private boolean tomate;
    private String molho;

    public Sanduiche(String pao, String carne, String queijo, boolean alface, boolean tomate, String molho) {
        this.pao = pao;
        this.carne = carne;
        this.queijo = queijo;
        this.alface = alface;
        this.tomate = tomate;
        this.molho = molho;
    }

    @Override
    public String toString() {
        return "Sanduiche{" +
                "pao='" + pao + '\'' +
                ", carne='" + carne + '\'' +
                ", queijo='" + queijo + '\'' +
                ", alface=" + alface +
                ", tomate=" + tomate +
                ", molho='" + molho + '\'' +
                '}';
    }
}
