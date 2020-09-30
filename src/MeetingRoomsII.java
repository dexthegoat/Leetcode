import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Given an array of meeting time intervals consisting of start and end times
 * [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.
 *
 * Example 1:
 *
 * Input: [[0, 30],[5, 10],[15, 20]]
 * Output: 2
 * Example 2:
 *
 * Input: [[7,10],[2,4]]
 * Output: 1
 */
public class MeetingRoomsII {

    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) return 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(intervals.length, (x, y) -> x - y);
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        queue.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= queue.peek()) queue.poll();
            queue.add(intervals[i][1]);
        }

        return queue.size();

    }

    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        arr[0][0] = 7;
        arr[0][1] = 10;
        arr[1][0] = 2;
        arr[1][1] = 4;
        // Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        // System.out.println(Arrays.toString(arr[0]));
        System.out.println(new MeetingRoomsII().minMeetingRooms(arr));
    }
}
