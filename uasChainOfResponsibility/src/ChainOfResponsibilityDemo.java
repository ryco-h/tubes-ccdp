public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        ChainSorter pakaian = new ChainSorter();

        pakaian.process(new Pakaian("baju", "L", 35000));
        pakaian.process(new Pakaian("celana", "XL",50000));
        pakaian.process(new Pakaian("baju", "M", 40000));
        pakaian.process(new Pakaian("jas", "LLL", 125000));
    }
}
