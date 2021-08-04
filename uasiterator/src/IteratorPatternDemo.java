public class IteratorPatternDemo {

    public static void main(String args[]) {

            System.out.println("\n-------Mengolah Stok 1--------\n");
            StokCollection stokCollection2 = new StokCollection(5);
            CollectionReader stok2 = new CollectionReader(stokCollection2);
            stok2.outputStok();

            System.out.println("\n-------Mengolah Stok 2--------\n");
            StokCollection stokCollection1 = new StokCollection(10);
            CollectionReader stok1 = new CollectionReader(stokCollection1);
            stok1.outputStok();

    }
}
