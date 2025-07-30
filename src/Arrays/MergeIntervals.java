package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][0];
        }

        // sort intervals based on the start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        System.out.println("Sorted Intervals: " + Arrays.toString(intervals));

        List<int[]> mergedIntervals = new ArrayList<>();

        for (int[] interval : intervals) {
            if (mergedIntervals.isEmpty() || mergedIntervals.get(mergedIntervals.size() - 1)[1] < interval[0]) {
                mergedIntervals.add(interval);
            } else {
                mergedIntervals.get(mergedIntervals.size()-1)[1] = Math.max(mergedIntervals.get(mergedIntervals.size() - 1)[1], interval[1]);
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {4, 5}, {6, 9} };

        int[][] merged = mergeIntervals(intervals);

        System.out.println("Merged Intervals: ");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
