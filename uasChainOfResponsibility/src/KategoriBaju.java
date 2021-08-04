public class KategoriBaju extends Sorter {

    public KategoriBaju(Sorter kategori){

        super(kategori);
    }

    public void process(Pakaian request)
    {
        if (request.getJenis().equals("baju"))
        {
            System.out.println("\nMemproses pakaian: Baju");
            System.out.println("Ukuran "+ request.getJenis() + ": " + request.getUkuran());
            System.out.println("Harga pakaian: " + request.getHarga() + "\n");
        }
        else
        {
            super.process(request);
        }
    }
}
