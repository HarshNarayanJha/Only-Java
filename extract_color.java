class extract_color {

    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Exactly One Argument is required!");
            System.out.println("Missing: Color Code");
            System.out.println("Usage: java extract_color.java \"#abcdef\"");
            System.out.println("Then the individual RGB values are printed in the range 0-255");
        }

        String code = args[0];
        if (code.charAt(0) != '#' || (code.length() != 4 && code.length() != 7)) {
            System.out.println(code.length());
            System.out.println("Invalid Color Code passed!");
            System.out.println("It must start with a # and must contain 3 or 6 hex digits!");
        }

        int r, g, b;

        if (code.length() == 4) {
            int val;
            val = Integer.parseInt(
                Character.toString(code.charAt(1)) +
                code.charAt(1) +
                code.charAt(2) +
                code.charAt(2) +
                code.charAt(3) +
                code.charAt(3),
                16
            );

            System.out.println("#" + Integer.toHexString(val) + " = " + val);

            r = (val & 0xff0000) >> 16;
            g = (val & 0x00ff00) >> 8;
            b = (val & 0x0000ff);
        } else {
            int val;
            val = Integer.parseInt(code.substring(1), 16);

            r = (val & 0xff0000) >> 16;
            g = (val & 0x00ff00) >> 8;
            b = (val & 0x0000ff);
        }

        System.out.println("R: " + r);
        System.out.println("G: " + g);
        System.out.println("B: " + b);

        System.out.println("\nrgb(" + r + ", " + g + ", " + b + ")");
    }
}
