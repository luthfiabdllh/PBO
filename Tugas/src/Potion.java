enum etipePotion {
    Attack,
    Heal
}
public class Potion extends Item implements Iattack{
    private int duration;
    private int effectPoint;
    private etipePotion tipePotion;


    public Potion(String nama, int rank, double price, int duration, int effectPoin, etipePotion tipePotion) {
        super(nama, rank, price);
        this.duration = duration;
        this.effectPoint = effectPoin;
        this.tipePotion = tipePotion;
    }

    public void use() {
        switch (tipePotion) {
            case Attack :
                attack();
                break;
            case Heal:
                heal();
                break;
        }
    }

    @Override
    public void attack() {
        System.out.println("Damage dealt by " + effectPoint);
    }

    public void heal() {
        System.out.println("Healed by " + effectPoint);
    }
}
