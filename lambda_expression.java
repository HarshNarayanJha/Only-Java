@FunctionalInterface
interface MyInterface {
    void message(String name);
}

public class lambda_expression {

    public static void main(String[] args) {
        MyInterface myInterface = name -> {
            System.out.println("Hello " + name);
        };

        MyInterface inlineClass = new MyInterface() {
            @Override
            public void message(String name) {
                System.out.println("Hello from inline class " + name);
            }
        };

        String name = "Java";
        inlineClass.message(name);
        myInterface.message(name);
    }
}
