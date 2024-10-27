public class exception_handling {

    public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("pants");
            System.out.println("THis won't print");
        } catch (NumberFormatException | NullPointerException nfe) {
            System.err.println("not a number");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            System.out.println("Finalyy");
        }

        System.out.println("Last Line");

        System.out.println(printANumber());
    }

    private static int printANumber() {
        try {
            return 3;
        } catch (Exception e) {
            return 4;
        } finally {
            return 5;
        }
    }
}
