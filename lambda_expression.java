@FunctionalInterface
interface MyInterface {
    void message();
}

public class lambda_expression {

    public static void main(String[] args) {
        MyInterface myInterface = () -> {
            System.out.println("Hello World");
        };

        MyInterface inlineClass = new MyInterface() {
            @Override
            public void message() {
                System.out.println("Hello from inline class");
            }
        };

        inlineClass.message();
        myInterface.message();
    }
}
