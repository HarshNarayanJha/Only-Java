interface Prey {
    void flee();
}

interface Predetor {
    void hunt();
}

class Fish implements Prey, Predetor {
    public void flee() {
        System.out.println("Fish fled");
    }
    public void hunt() {
        System.out.println("Fish hunts now!");
    }
}

class Hawk implements Predetor {
    @Override
    public void hunt() {
        System.out.println("Hawk Hunting for Prey!");
    }
}

class Rabbit implements Prey {
    @Override
    public void flee() {
        System.out.println("Rabbit fled");
    }
}
class interfaces {
    public static void main(String[] args) {
        Rabbit r1 = new Rabbit();
        r1.flee();

        Hawk h1 = new Hawk();
        h1.hunt();

        Fish f1 = new Fish();
        f1.hunt();
        f1.flee();
    }
}
