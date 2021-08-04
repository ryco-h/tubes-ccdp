public class PakaianDecorator implements Pakaian {

    public Pakaian pakaianTerdekorasi;

    public PakaianDecorator(Pakaian pakaianTerdekorasi) {
        this.pakaianTerdekorasi = pakaianTerdekorasi;
    }

    public void sort(String warna) {
        pakaianTerdekorasi.sort(warna);
    }
}
