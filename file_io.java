import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

class file_io {
    public static void main(String[] args) {

        String[] names = {"John", "Caleb", "Curry", "Mario"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("java_io.txt"));
            for (String name : names) {
                writer.write(name + "\n");
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("java_io.txt"));
            ArrayList<String> lines = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            System.out.println("Read from file...");
            System.out.println(lines);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
