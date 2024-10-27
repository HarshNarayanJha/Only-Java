class Animal {

    int age;
    String name;

    public Animal() {}

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Hello, I am an Animal");
    }

    public void eat() {
        System.out.println("Munch Munch");
    }

    @SuppressWarnings("unused")
    private void privateToMe() {
        System.out.println("Can't call me hehehe..");
    }
}

class Cat extends Animal {

    String catFood;

    public Cat() {}

    public Cat(int age, String name, String catFood) {
        // Call the superclass (parent's) constructor
        // super call must be the first in the constructor
        // super() can be called in the constructor method only
        // super(); is called automatically if no super constructed is manually called
        // This is the default or added no args constructor (otherwise error)
        super(age, name);
        this.catFood = catFood;
    }

    @Override
    public void makeNoise() {
        // Call the parent makeNoise implementation
        // can also assign to variables using super
        // like super.name = "Something";
        super.makeNoise();
        System.out.println("Meow Meow");
    }

    @SuppressWarnings("unused")
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

        @SuppressWarnings("unused")
        Cat cat2 = new Cat(23, "Kitty", "Fish");
    }
}
