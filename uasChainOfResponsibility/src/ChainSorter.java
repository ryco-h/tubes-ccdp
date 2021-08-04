public class ChainSorter {
    Sorter kategori;

    public ChainSorter(){
        buildChain();
    }

    private void buildChain() {
        kategori = new KategoriBaju(new KategoriCelana(new KategoriJas(null)));
    }

    public void process(Pakaian request) {
        kategori.process(request);
    }
}
