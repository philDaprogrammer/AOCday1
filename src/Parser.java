import java.io.IOException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Parser {
    private final String filename;

    public Parser(String filename) {this.filename = filename;}

    public Solution parse() {
        ArrayList<Integer> depths  = new ArrayList<>();

        try {
            FileInputStream stream = new FileInputStream(this.filename);
            Scanner sc             = new Scanner(stream);

            while (sc.hasNext()) {
                depths.add(Integer.parseInt(sc.next()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Solution(depths);
    }
}