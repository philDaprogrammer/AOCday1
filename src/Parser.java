import java.io.IOException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Parser {
    public ArrayList<Integer> parse(String filename) {
        ArrayList<Integer> depths = new ArrayList<>();

        try {
            FileInputStream stream = new FileInputStream(filename);
            Scanner sc             = new Scanner(stream);

            while (sc.hasNext()) {
                depths.add(Integer.parseInt(sc.next()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return depths;
    }
}