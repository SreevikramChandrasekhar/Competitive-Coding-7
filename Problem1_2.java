//Time Complexity : O(n*log(n))
//Space Complexity: O(n)
//Code run successfully on LeetCode.

public class Problem1_2 {

    public int minMeetingRooms(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.add(intervals[0][1]);
        
        for(int i =1; i < intervals.length; i++){
            
            if(intervals[i][0] >= pq.peek())
                pq.poll();
            
            pq.add(intervals[i][1]);
        }
         return pq.size();
    }
}
