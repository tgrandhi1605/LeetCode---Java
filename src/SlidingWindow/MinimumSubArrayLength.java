package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinimumSubArrayLength {
    // Failed when submitted in leetcode for huge numbr test case.
    public static int minSubArrayLength(int target, int[] nums) {
        List<int[]> possibleSubArrays = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                temp += nums[j];
                if (temp >= target) {
                    int[] subArray = Arrays.copyOfRange(nums, i, j + 1);
                    possibleSubArrays.add(subArray);
                    break;
                }
            }
        }

        return possibleSubArrays.stream().min(Comparator.comparingInt(arr -> arr.length)).map(arr -> arr.length).orElse(0);
    }

    public static int minSubArrayLengthOptimised(int total, int[] nums) {
        int left = 0;
        int temp = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            temp += nums[right];

            while (temp >= total) {
                minLength = Math.min(minLength, right - left + 1);
                temp -= nums[left++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLengthOptimised(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(minSubArrayLengthOptimised(4, new int[]{1, 4, 4}));
        System.out.println(minSubArrayLengthOptimised(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }
}
