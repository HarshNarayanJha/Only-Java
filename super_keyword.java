public class Animal {
    int age;
    String name;

    public Animal() {}

    public void makeNoise() {
        System.out.println("Hello, I am an Animal");
    }

    public void eat() {
        System.out.println("Munch Munch");
    }

    private void privateToMe() {
        System.out.println("Can't call me hehehe..");
    }
}

class Cat extends Animal {
    String catFood;

    @Override
    public void makeNoise() {
        // Call the parent makeNoise implementation
        super.makeNoise();
        System.out.println("Meow Meow");
    }

    private void privateToMe() {
        // can't do this since private access
        // super.privateToMe();
    }
}
class super_keyword {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeNoise();
        cat.eat();
        // Can't call this since private to Animal
        // cat.privateToMe();
    }
}
