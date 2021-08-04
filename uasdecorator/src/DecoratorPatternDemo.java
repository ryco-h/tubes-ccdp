public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Pakaian baju = new Baju();
        Pakaian celana = new Celana();
        Pakaian bajuTerdekorasi = new WarnaPakaianDecorator(new Baju());
        Pakaian celanaTerdekorasi = new WarnaPakaianDecorator(new Celana());

        System.out.println("\n----Sorting tanpa dekorasi----");
        baju.sort(null);
        celana.sort(null);

        System.out.println("\n----Sorting dengan dekorasi----");
        bajuTerdekorasi.sort("biru");
        celanaTerdekorasi.sort("biru");
        celanaTerdekorasi.sort("merah");

    }
}
