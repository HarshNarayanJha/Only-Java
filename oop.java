class Person {

    String name;
    private int age;
    float assets;

    static int numEyes;

    static final int MAX_AGE = 60;

    Person() {
        // this keyword, just like the super keyword, can also be used to call any matching constructor
        // from any constructor (raises error if not found)
        // used for default setting
        // needs's to be very first statement in the constructor
        // can be called only in a constructor
        this("Person XYZ", 0, 0);
    }

    Person(String name, int age, float assets) {
        this.name = name;
        this.age = age;
        this.assets = assets;
    }

    Person(String name) {
        this.name = name;
        age = 0;
        assets = 0;
    }

    static void evolve() {
        System.out.println("Evolving...");
        numEyes++;
    }

    boolean amIDead() {
        return age > MAX_AGE;
    }

    void setAge(int age) {
        if (age < 0) {
            System.out.println("You are not yet born");
            return;
        }
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void birthday() {
        System.out.println("Happy Birthday! " + this.name);
        age++;
    }

    void buy() {
        assets++;
    }

    void buy(float amount) {
        assets += amount;
    }

    boolean equals(Person person0) {
        return name.equals(person0.name) && age == person0.age && assets == person0.assets;
    }

    public String toString() {
        return "Name: " + name + "\n" + "Age is: " + age + "\n" + "Has Assets: " + assets + "\n";
    }
}

class oop {

    public static void main(String args[]) {
        Person.numEyes = 2;

        Person person1 = new Person("Achu", 20, 50.0f);
        Person person2 = new Person("Satyam", 17, 40099000.0f);
        Person per3 = new Person("Ansh");

        System.out.println(person1);
        person1.birthday();
        System.out.println(person1);

        person1.buy();
        System.out.println(person1);

        person1.buy(100.0f);
        System.out.println(person1);

        if (person2.getAge() >= 18) {
            System.out.println("can Vote");
        } else {
            System.out.println("can't Vote");
        }

        System.out.println(Person.numEyes);
        Person.evolve();
        System.out.println(Person.numEyes);

        System.out.println("Person 1 is Dead : " + person1.amIDead());
        person2.setAge(100);
        System.out.println("Person 2 is Dead : " + person2.amIDead());

        System.out.println(per3);

        Person infant = new Person();
        infant.birthday();
        System.out.println(infant.name);
        System.out.println(infant.getAge());
    }
}
