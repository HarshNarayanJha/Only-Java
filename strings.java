// Gonna learn String, StringBuilder and StringBuffer

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class strings {

    public static void main(String[] args) {
        // So both strings are stored in a string pool, and both vars name and test point to the same thing
        String name = "Hello World";
        String test = "Hello World";
        // that is basically why Strings are immutable in java, otherwise changing name's memory would change test's too.
        // But we can create Strings on heap, each time, separately. Using new String() constructor
        String heap = new String("Heap");
        String heap2 = new String("Heap");

        System.out.println(name == test);
        System.out.println(heap == heap2);
        System.out.println(heap.equals(heap2));

        System.out.println();

        // methods
        name = "New";

        System.out.println(name + " Char At 1 is " + name.charAt(1));

        // Concat
        System.out.println(name.concat(" World"));
        System.out.println(name);

        System.out.println();

        // Mutable Strings
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append("Buffer");

        // buffer.insert(5, " ");

        buffer.delete(0, 5);

        System.out.println(buffer.toString());

        // String Builder
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append("Builder");

        // builder.insert(5, " ");

        builder.delete(0, 5);

        System.out.println(builder.toString());

        System.out.println();

        /// Characters
        char c = 'H';
        // System.out.println(c);
        Character c2 = new Character(c);
        // System.out.println(c2);

        Scanner sc = new Scanner(System.in);
        // c2 = sc.nextLine().charAt(0);

        // if (Character.isDigit(c2)) {
        //     System.out.println("Your eneted dogit");
        // } else if (Character.isLowerCase(c2)) {
        //     System.out.println("Your eneted lowercase, It's uppercase is: " + Character.toUpperCase(c2));
        // } else if (Character.isUpperCase(c2)) {
        //     System.out.println("Your eneted uppercase, It's lowercase is: " + Character.toLowerCase(c2));
        // }

        System.out.println();

        // String Tokenizer
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line, ",");

        System.out.println("Number of Fields: " + st.countTokens());

        ArrayList<String> tokens = new ArrayList<String>();

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            tokens.add(token);
            System.out.println(token);
        }

        sc.close();

        System.out.println();

        // Regexes
        System.out.println(Pattern.matches("BIT.+", tokens.get(4)));
    }
}
