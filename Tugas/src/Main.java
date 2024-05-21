public class Main {
    public static void main(String[] args) {
        //Test Sword
        Sword sword = new Sword("Excalibur", 5, 100.0, 50);
        sword.display();
        sword.attack();
        //Test Potion
        Potion potion1 = new Potion("Attack Potion", 1, 10.0, 5, 5, etipePotion.Attack);
        potion1.display();
        potion1.use();
        Potion potion2 = new Potion("Health Potion", 3, 20.0, 5, 15, etipePotion.Heal);
        potion2.display();
        potion2.use();
        //Test Shield
        Shield shield = new Shield("Tower Shield", 4, 80.0, 20);
        shield.display();
        shield.defense();
    }
}
