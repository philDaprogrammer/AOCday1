import java.util.ArrayList;


public class Solution {
    private final ArrayList<Integer> depths;

    public Solution(ArrayList<Integer> depths) {this.depths = depths;}

    public void part1() {
        Integer currentDepth = this.depths.remove(0);
        int sum = 0;

        for (Integer depth : this.depths) {
            if (depth > currentDepth) {
                sum++;
            }

            currentDepth = depth;
        }

        System.out.println("Total increases: " + sum);
    }
}