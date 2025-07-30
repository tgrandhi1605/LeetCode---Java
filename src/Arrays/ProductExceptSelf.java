package Arrays;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                product *= nums[j];
            }
            result[i] = product;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 3, 1, 4};
        int[] result = productExceptSelf(nums);

        System.out.print(Arrays.toString(result));
    }
}
