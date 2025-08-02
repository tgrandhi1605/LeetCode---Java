package HashMaps;

import java.util.*;
import java.util.stream.Collectors;

public class TopFrequentElements {
    public static int[] topFrequentElement(int[] nums, int k) {
        Map<Integer, Integer> frequencyCount = new HashMap<>();

        for (int n : nums) {
            frequencyCount.put(n, frequencyCount.getOrDefault(n, 0) + 1);
        }
        List<Integer> values;
        values = frequencyCount.entrySet().stream().filter(entry -> entry.getValue() >= k).map(Map.Entry::getKey).toList();

        int[] returnValues = new int[values.size()];
        for (int i = 0; i < values.size(); i++) {
            returnValues[i] = values.get(i);
        }
        return returnValues;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topFrequentElement(new int[]{1,2}, 2)));
    }
}
