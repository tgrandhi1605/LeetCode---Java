package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
        } else {
            System.out.println("No two sum solution found.");
        }

        int[] nums2 = new int[]{3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum.twoSum(nums2, target2);
        if (result2.length == 2) {
            System.out.println("Indices: " + result2[0] + ", " + result2[1]); // Output: Indices: 1, 2
        } else {
            System.out.println("No two sum solution found.");
        }


    }
}
