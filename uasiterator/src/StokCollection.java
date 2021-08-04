class StokCollection implements Collection {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Stok[] stokList;

    public StokCollection(Integer jumlahStok) {

        stokList = new Stok[MAX_ITEMS];
        Stok stok = new Stok(jumlahStok);

        Integer jumlahBarang = stok.getJumlahBarang();

        for (int i = 0; i < jumlahBarang; i++) {
            addItem(jumlahBarang);
        }
    }

    public void addItem(Integer jumlahBarang) {

        Stok stok = new Stok(jumlahBarang);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("\nStok penuh, batas stok maksimal = 6\n");
            numberOfItems = 0;
            stokList[numberOfItems] = stok;
        }
        else
        {
            stokList[numberOfItems] = stok;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {

        return new StokIterator(stokList);
    }
}