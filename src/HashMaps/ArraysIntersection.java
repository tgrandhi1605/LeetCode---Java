package HashMaps;

import java.util.*;

public class ArraysIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i : nums1) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }

        for (int i : nums2) {
            if (frequencyMap.containsKey(i)) {
                if (frequencyMap.get(i) > 0) {
                    result.add(i);
                    frequencyMap.put(i, frequencyMap.get(i) - 1);
                }
            }
        }
        int[] finalResult = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            finalResult[k] = result.get(k);
        }
        return finalResult;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{4, 9, 5};
        int[] num2 = new int[]{9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }
}
