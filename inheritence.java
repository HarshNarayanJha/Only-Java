import java.util.ArrayList;

enum Days {
    MONDAY,
    TUESDAY,
    WEB

    ;
}

class Animal {

    String name;
    int legs;

    Animal() {}

    Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    void sayHi() {
        System.out.println("Hi! My name is " + name + ", and I have " + legs + " legs.");
    }
}

class Dog extends Animal {

    Dog(String name) {
        this.name = name;
        legs = 4;
    }

    void bark() {
        System.out.println("I am dog " + name);
    }
}

class Kangaroo extends Animal {

    Kangaroo(String name) {
        super(name, 2);
    }

    void sayHi() {
        System.out.println("New sayHi!, I am a Kangaroo, I Jump!");
    }
}

class Bulldog extends Dog {

    Bulldog() {
        super("BullDog");
    }
}

class inheritence {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        Animal animal = new Animal("Satyam", 2);
        Dog dog = new Dog("Billy");
        Kangaroo kag = new Kangaroo("Kang");
        kag.sayHi();
        dog.sayHi();
        Dog bull = new Bulldog();
        bull.bark();
        bull.sayHi();
        // int arr[] = new int[5];
        // arr[0] = 1;
        // arr[1] = 5;
        // arr[4] = 8;

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // printArray(arr);

        // for (int e: arr) {
        //     System.out.println(e);
        // }

        // ArrayList<Integer> al = new ArrayList<Integer>();

        // al.add(1);
        // al.add(2);
        // al.add(3);
        //

        // System.out.println(al);
        //
    }
}
