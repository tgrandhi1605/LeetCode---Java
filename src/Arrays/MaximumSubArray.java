package Arrays;

import java.util.Arrays;

public class MaximumSubArray {
    public static int[] maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // Extract the subarray from start to end
        return Arrays.copyOfRange(nums, start, end + 1);
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] subarray = maxSubArray(nums);

        System.out.println("Maximum Subarray: " + Arrays.toString(subarray));
        System.out.println("Maximum Sum: " + Arrays.stream(subarray).sum());

        int[] nums2 = {1, 2, 3, -2, 5};
        int[] subarray2 = maxSubArray(nums2);

        System.out.println("Maximum Subarray: " + Arrays.toString(subarray2));
        System.out.println("Maximum Sum: " + Arrays.stream(subarray2).sum());

        int[] nums3 = {-1, -2, -3, -4};
        int[] subarray3 = maxSubArray(nums3);
        System.out.println("Maximum Subarray: " + Arrays.toString(subarray3));
        System.out.println("Maximum Sum: " + Arrays.stream(subarray3).sum());

    }
}
