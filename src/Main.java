public class Main {
    public static void main(String[] args) {
        Chargeable[] chargeables = new Chargeable[3];
        chargeables[0] = new Phone();
        chargeables[1] = new Tablet();
        chargeables[2] = new Laptop();

        for(Chargeable chargeable : chargeables)
        {
            chargeable.charge();
        }
    }
}