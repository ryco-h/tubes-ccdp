public class StokIterator implements Iterator {

        Stok[] stokList;
        int posisi = 0;

        public  StokIterator (Stok[] stokList){

            this.stokList = stokList;
        }

        public Object next() {

            Stok jumlahStok =  stokList[posisi];
            posisi += 1;
            return jumlahStok;
        }

        public boolean hasNext() {

            return posisi < stokList.length && stokList[posisi] != null;
        }
}
