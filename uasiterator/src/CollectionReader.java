public class CollectionReader {

    StokCollection stok;
    Integer counter;

    public CollectionReader(StokCollection stok) {

        this.stok = stok;
    }

    public void outputStok() {

        counter = 0;
        Iterator iterator = stok.createIterator();

        while (iterator.hasNext())
        {
            counter = counter + 1;
            Stok stok = (Stok)iterator.next();
            System.out.println("Memproses barang ke-" + counter);
            if (counter > stok.getJumlahBarang()) {
                break;
            }
        }
    }
}
