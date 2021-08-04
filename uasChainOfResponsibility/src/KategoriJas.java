public class KategoriJas extends Sorter {

    public KategoriJas(Sorter kategori){

        super(kategori);
    }

    public void process(Pakaian request)
    {
        if (request.getJenis().equals("jas"))
        {
            System.out.println("\nMemproses pakaian: Jas");
            System.out.println("Ukuran "+ request.getJenis() + ": " + request.getUkuran());
            System.out.println("Harga pakaian: " + request.getHarga() + "\n");
        }
        else
        {
            super.process(request);
        }
    }
}
