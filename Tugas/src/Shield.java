public class Shield extends Item {
    private int damageBlock;

    public Shield(String nama, int rank, double price, int damageBlock) {
        super(nama, rank, price);
        this.damageBlock = damageBlock;
    }

    public void defense(){
        System.out.println("Damage Mitigated by " + damageBlock);
    }
}

