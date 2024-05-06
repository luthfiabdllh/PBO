public class Main {
    public static void main(String[] args) {
        Car innova = new Car("Innova Reborn", 500.0, 2015, CarType.PREMIUM_CAR);
        Car avanza = new Car("Avanza", 300.0, 2009, CarType.FAMILY_CAR);
        Car brio = new Car("Honda Brio", 300.0, 2012, CarType.CITY_CAR);

        innova.displayInfo();
        avanza.displayInfo();
        brio.displayInfo();

        Truck isuzuTruck = new Truck("Isuzu", 500, 2013, 1500);
        Truck volvoTruck = new Truck("Volvo", 650, 2013, 2500);
        Truck hinoTruck = new Truck("Hino", 800, 2005, 4000);
        Truck mitsubishiTruck = new Truck("Mitsubishi", 850, 2010, 4000);

        isuzuTruck.displayInfo();
        volvoTruck.displayInfo();
        hinoTruck.displayInfo();
        mitsubishiTruck.displayInfo();
    }
}