public class KategoriCelana extends Sorter {

    public KategoriCelana(Sorter kategori){

        super(kategori);
    }

    public void process(Pakaian request)
    {
        if (request.getJenis().equals("celana"))
        {
            System.out.println("\nMemproses pakaian: Celana");
            System.out.println("Ukuran "+ request.getJenis() + ": " + request.getUkuran());
            System.out.println("Harga pakaian: " + request.getHarga() + "\n");
        }
        else
        {
            super.process(request);
        }
    }
}
