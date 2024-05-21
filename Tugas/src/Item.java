public abstract class Item {
    private String nama;
    private int rank;
    private double price;

    public Item(String nama, int rank, double price) {
        this.nama = nama;
        this.rank = rank;
        this.price = price;
    }

    public void display() {
        System.out.println("Item " + nama + " ,dengan rank " + rank + " dan price "+price);
    }
}
