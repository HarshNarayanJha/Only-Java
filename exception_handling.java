public class exception_handling {

    public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("pants");
        } catch (NumberFormatException nfe) {
            System.err.println("not a number");
        }
    }
}
