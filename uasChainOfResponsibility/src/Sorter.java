public class Sorter {
    private Sorter kategori;

    public Sorter(Sorter kategori){
        this.kategori = kategori;
    };

    public void process(Pakaian request){
        if(kategori != null)
            kategori.process(request);
    };
}
