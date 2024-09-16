class type_promotion {
    static double multiply(double x, double y) {
        return x * y;
    }
    public static void main(String args[]) {
        double x = multiply(2, 3);
        System.out.println(x);
    }
}
