import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Parser parser             = new Parser();
        Solution solution         = new Solution();
        ArrayList<Integer> depths = parser.parse("input.txt");

        solution.part1(depths);
        solution.part2(depths);
    }
}