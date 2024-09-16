class bitshifts {
    public static void main(String args[]) {

        // 00000000000000000000000000000101 << 2 = 00000000000000000000000000010100 = 20
        System.out.println(5 << 2);

        // 00000000000000000000000000000101 >> 2 = 00000000000000000000000000000001 = 1
        System.out.println(5 >> 2);

        // 00000000000000000000000000000101 >>> 2 = 00000000000000000000000000000001 = 1
        System.out.println(5 >>> 2);


        // But for unsinged numbers, BEWARE!
        //
        // 11111111111111111111111111111011 << 2 = 11111111111111111111111111101100 = -20
        System.out.println(-5 << 2);

        // 11111111111111111111111111111011 >> 2 = 11111111111111111111111111111110 = -2
        System.out.println(-5 >> 2);

        // 11111111111111111111111111111011 >>> 2 = 00111111111111111111111111111110 = 1073741822
        System.out.println(-5 >>> 2);

        // What about floating points, actually, forget about it?

        // System.out.println(5 >> 0.5);
        // Okay bad operands

        // Not gonna happen!
        // System.out.println(4.5 >> 5.0);

        // Final!
        // System.out.println(3.4 >> 2);
        // Not A CHANCE!

    }
}
