package builder;

public class Main {
    public static void main(String[] args) {
        Sanduiche sanduiche1 = new SanduicheBuilder()
                .setPao("Branco")
                .setCarne("Presunto")
                .build();

        Sanduiche sanduiche2 = new SanduicheBuilder()
                .setPao("Integral")
                .setCarne("Peito de Frango")
                .setQueijo("Cheddar")
                .setAlface(true)
                .setTomate(true)
                .setMolho("Barbecue")
                .build();

        System.out.println(sanduiche1);
        System.out.println(sanduiche2);
    }
}
