import java.util.ArrayList;


public class Solution {
    public void part1(ArrayList<Integer> depths){
        Integer currentDepth = depths.remove(0);
        int sum = 0;

        for (Integer depth : depths) {
            if (depth > currentDepth) { sum++; }

            currentDepth = depth;
        }

        System.out.println("Total increases: " + sum);
    }

    public void part2(ArrayList<Integer> depths) {
        int sum = 0;

        for (int i=0; i < depths.size()-3; ++i) {
            int v1 = depths.get(i) + depths.get(i+1) + depths.get(i + 2);
            int v2 = depths.get(i+1) + depths.get(i+2) + depths.get(i+3);

            if (v2 > v1) { sum++; }
        }

        System.out.println("Window increases: " + sum);
    }
}