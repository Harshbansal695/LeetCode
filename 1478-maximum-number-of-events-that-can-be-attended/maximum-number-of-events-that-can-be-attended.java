class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> min = new PriorityQueue<>();
        int e = 0;
        int i = 0;
        int n = events.length;
        int cd = 0;
        int maxDay = 0;
        for (int[] event : events) {
            maxDay = Math.max(maxDay, event[1]);
        }
        for (cd = 1; cd <= maxDay; cd++) {
            while (i < n && events[i][0] == cd) {
                min.offer(events[i][1]);
                i++;
            }
            while (!min.isEmpty() && min.peek() < cd) {
                min.poll();
            }
            if (!min.isEmpty()) {
                min.poll();
                e++;
            }
        }
        return e;
    }
}