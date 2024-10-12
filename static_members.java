class Car {
    static int mileage;
    private int fuel;

    static {
        // This is static block is like a constructor for the static vars/methods
        // it runs once whenever the class is first instatiated
        // i.e. when the class first loads up!
        System.out.println("This is the static block");
        mileage = 200;
    }

    void setFuel(int fuel) {
        this.fuel = fuel;
    }

    int getFuel() {
        return fuel;
    }

    void drive() {
        if (fuel <= 0) {
            System.out.println("No Fuel Left, go Petrol Pump");
            return;
        }
        System.out.println("Drove");
        fuel--;
        System.out.println("Now Fuel is " + fuel);
    }
}

class static_members {
    public static void main(String args[]) {
        // But we can call the static block using Class loader!
        // Class.forName("Car");
        // System.out.println("Car should be loaded by now!");
        Car car1 = new Car();
        Car car2 = new Car();

        Car.mileage = 10;

        car1.setFuel(10);
        car1.drive();

        car2.setFuel(20);
        car2.drive();
    }
}
