public class Pakaian {

    private String jenis;
    private String ukuran;
    private Integer harga;

    public Pakaian(String jenis, String ukuran, Integer harga)
    {
        this.jenis = jenis;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    public String getJenis()
    {
        return jenis;
    }

    public String getUkuran() {
        return ukuran;
    }

    public Integer getHarga() {
        return harga;
    }
}
