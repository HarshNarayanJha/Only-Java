import java.io.*;

class Car implements Serializable {

    String name;
    int number;
}

public class serialization {

    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Honda";
        car.number = 12;

        try {
            FileOutputStream stream = new FileOutputStream("car.dat");
            ObjectOutputStream out = new ObjectOutputStream(stream);
            out.writeObject(car);
            out.close();
            stream.close();
        } catch (Exception io) {
            System.out.println(io);
        }

        // try with resources
        try (
            FileInputStream stream = new FileInputStream("car.dat");
            ObjectInputStream in = new ObjectInputStream(stream);
        ) {
            Car c = (Car) in.readObject();
            System.out.println(c.name + c.number);
        } catch (Exception io) {
            System.out.println(io);
        }
    }
}
