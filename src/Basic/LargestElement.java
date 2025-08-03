package Basic;

import java.util.Arrays;
import java.util.List;

public class LargestElement {
    public static int largestElementInAList(List<Integer> nums) {
        return nums.stream().max(Integer::compare).get();
    }

    public static void main(String[] args) {
        System.out.println(largestElementInAList(Arrays.asList(1, 2, 3, 4, 4, 6, 3)));
    }
}
