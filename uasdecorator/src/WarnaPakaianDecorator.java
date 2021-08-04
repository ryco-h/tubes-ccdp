public class WarnaPakaianDecorator extends PakaianDecorator {

    public WarnaPakaianDecorator(Pakaian pakaianTerdekorasi) {
        super(pakaianTerdekorasi);
    }

    @Override public void sort(String warna) {
        pakaianTerdekorasi.sort(warna);
        setWarnaPakaian(pakaianTerdekorasi, warna);
    }

    public void setWarnaPakaian(Pakaian pakaianTerdekorasi, String warna) {
        System.out.println("Warna pakaian: " + warna);
    }
}
