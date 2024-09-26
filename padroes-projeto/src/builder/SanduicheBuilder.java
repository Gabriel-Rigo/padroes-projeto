package builder;

public class SanduicheBuilder {
    private String pao;
    private String carne;
    private String queijo;
    private boolean alface;
    private boolean tomate;
    private String molho;

    public SanduicheBuilder setPao(String pao) {
        this.pao = pao;
        return this;
    }

    public SanduicheBuilder setCarne(String carne) {
        this.carne = carne;
        return this;
    }

    public SanduicheBuilder setQueijo(String queijo) {
        this.queijo = queijo;
        return this;
    }

    public SanduicheBuilder setAlface(boolean alface) {
        this.alface = alface;
        return this;
    }

    public SanduicheBuilder setTomate(boolean tomate) {
        this.tomate = tomate;
        return this;
    }

    public SanduicheBuilder setMolho(String molho) {
        this.molho = molho;
        return this;
    }

    public Sanduiche build() {
        return new Sanduiche(pao, carne, queijo, alface, tomate, molho);
    }
}
