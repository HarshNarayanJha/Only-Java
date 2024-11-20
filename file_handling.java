import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling {

    public static void main(String[] args) {
        File f = new File("java_file.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException io) {
                System.out.println("An IO Exception Occurred");
            }

            return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Line: ");
        String line = sc.nextLine();

        try {
            FileWriter fw = new FileWriter(f);
            fw.write(line);
            fw.close();
        } catch (IOException io) {
            System.out.println("An IO Exception Occurred");
        }

        sc.close();

        File secret = new File("hello_file.txt");
        if (secret.exists()) {
            try {
                Scanner secretSc = new Scanner(secret);
                System.out.println(secretSc.nextLine());

                secretSc.close();
            } catch (FileNotFoundException fnfe) {
                System.out.println("File Secret was not found!");
            }
        }
    }
}
