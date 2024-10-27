import java.util.Scanner;

class para {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for (String e : words) {
            char fl = Character.toLowerCase(e.charAt(0));
            if (fl == 'a' || fl == 'e' || fl == 'i' || fl == 'o' || fl == 'u') {
                System.out.print(e.toUpperCase() + " ");
            } else {
                System.out.print("@" + e + "# ");
            }
        }

        sc.close();
    }
}
