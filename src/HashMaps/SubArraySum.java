package Arrays;

public class SubArraySum {
    public static int subArraySum(int[] nums, int total) {
        int totalSubArrays = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                temp += nums[j];
                if (temp == total) {
                    totalSubArrays++;
                }
            }

        }
        return totalSubArrays;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5};
        int totalSubArrays = subArraySum(nums, 6);

        System.out.println("Total number of sub arrays that matches the sum are: " + totalSubArrays);
    }
}
