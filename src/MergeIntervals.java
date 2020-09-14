import java.util.Arrays;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 *
 * Example 1:
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 *
 * Example 2:
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 *
 * NOTE: input types have been changed on April 15, 2019.
 * Please reset to default code definition to get new method signature.
 */
public class MergeIntervals {

    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
         int[] [] res = new int[intervals.length][2];
         int index = -1;
         for (int[] interval : intervals) {
             if (index == -1 || interval[0] > res[index][1]) {
                 res[++index] = interval;
             } else {
                 res[index][1] = Math.max(res[index][1], interval[1]);
             }
         }
         return Arrays.copyOf(res, index + 1);
    }
}
