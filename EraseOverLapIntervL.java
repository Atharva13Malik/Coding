import java.util.*;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        // Sort according to end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;

        // End time of the last selected interval
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int start = intervals[i][0];
            int end = intervals[i][1];

            // No overlap -> keep this interval
            if (start >= lastEnd) {
                lastEnd = end;
            }

            // Overlap -> remove current interval
            else {
                count++;
            }
        }

        return count;
    }
}
