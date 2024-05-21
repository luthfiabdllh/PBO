public class Sword extends Item implements Iattack{
    private int damage;

    public Sword(String nama, int rank, double price, int damage) {
        super(nama, rank, price);
        this.damage = damage;
    }

    public void attack(){
        System.out.println("Damage dealt by " + damage);
    }
}
