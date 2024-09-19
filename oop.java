class Person {

    String name;
    private int age;
    float assets;

    static int numEyes;

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
        System.out.println("Happy Birthday!");
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

        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "Achu";
        person1.setAge(20);
        person1.assets = 50.0f;

        person2.name = "Satyam";
        person2.setAge(17);
        person2.assets = 40099000.0f;

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

    }
}
