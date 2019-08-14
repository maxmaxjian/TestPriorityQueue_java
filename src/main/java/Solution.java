import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        int[] weights = {3, 2, 1};

        PriorityQueue<Integer> pq = new PriorityQueue<>(3,
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return weights[o1]-weights[o2];
                    }
                });

        for (int i = 0; i < weights.length; i++) {
            pq.add(i);
        }

        while (!pq.isEmpty()) {
            int curr = pq.remove();
            System.out.println(curr+": "+weights[curr]);
        }
    }

}
