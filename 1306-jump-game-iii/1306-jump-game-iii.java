class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int i = queue.poll();
            if (arr[i] == 0) return true;
            if (visited[i]) continue;
            visited[i] = true;

            int right = i + arr[i];
            int left  = i - arr[i];

            if (right < n)  queue.offer(right);
            if (left >= 0)  queue.offer(left);
        }

        return false;
    }
}