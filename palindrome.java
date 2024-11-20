import java.util.Scanner;

class palindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                System.out.println("Not a Palindrome");
                return;
            }
            i++;
            j--;
        }

        StringBuilder builder = new StringBuilder(str);
        builder.append(" is a palindrome");

        System.out.println(builder.toString());

        sc.close();
    }
}
