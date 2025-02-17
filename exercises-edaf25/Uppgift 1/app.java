import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class app {

    public static void main(String[] args) {
        // Create a new set of lines from the file data.txt
        Set<String> lines = new HashSet<>();
        try {
            File file = new File("C:\\Users\\mans\\Documents\\projekt\\exercises-edaf25\\Uppgift 1\\data.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = line.replaceAll("\\d+,", "");
                line = line.replaceAll("@\\w+", "");
                line = line.replaceAll("\\s+", " ");
                line = line.replaceAll("\\b(?:https?://|www\\.)\\S+\\b", "");
                line = line.replaceFirst("^RT\\s*:\\s*", "");
                lines.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        printRandomLine(lines);
    }

    // Print a random line from the set of lines
    public static void printRandomLine(Set<String> lines) {
        int size = lines.size();
        int item = (int) (Math.random() * size);
        int i = 0;
        for (String line : lines) {
            if (i == item)
                System.out.println(line);
            i++;
        }
    }
}