package SlidingWindow;

import java.util.*;

public class MaxSlidingWindow {
    // Solution is correct but time limit exceeded :sad_kid:
    public static int[] maxSlidingWindow(int[] nums, int k) {
        // input nums = [1,3,-1,-3,5,3,6,7], k = 3
        if (nums.length == 1 || k == 1) return nums;
        List<Integer> maxSlidingWindow = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i + k > nums.length) break;
            int[] subArray = Arrays.copyOfRange(nums, i, i + k);
            Arrays.sort(subArray);
            int maxNumber = subArray[subArray.length - 1];
            maxSlidingWindow.add(maxNumber);
        }
        int[] array = new int[maxSlidingWindow.size()];
        for (int j = 0; j < maxSlidingWindow.size(); j++) {
            array[j] = maxSlidingWindow.get(j);
        }
        return array;
    }

    // NOt my solution. Tricky to understand but efficient trust me O(n)
    public static int[] maxSlidingWindowOptimised(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove indices outside the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove indices of smaller elements (they can’t be max)
            while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                deque.pollLast();
            }

            // Add current index
            deque.offer(i);

            // Record max when first window is complete
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maxSlidingWindowOptimised(input, 3)));
    }
}
