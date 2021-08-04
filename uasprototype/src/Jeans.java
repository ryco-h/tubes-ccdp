public class Jeans extends Celana {
    public Jeans()
    {
        this.tipeCelana = "jeans";
    }

    @Override
    void tambahStok()
    {
        System.out.println("Menambahkan Celana Jeans...");
    }
}
