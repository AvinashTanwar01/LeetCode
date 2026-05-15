import java.util.*;

class Solution {
    static int maxRevenue = 0;
    static int cityA = Integer.MAX_VALUE;
    static int cityB = Integer.MAX_VALUE;

    static List<Integer>[] adj;
    static int[] subtreeSize;
    static int n;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int roads = sc.nextInt();  // should be n-1
        int x = sc.nextInt();      // always 2 (can be ignored here)

        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        int[][] edges = new int[roads][2];
        for (int i = 0; i < roads; i++) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            adj[c1].add(c2);
            adj[c2].add(c1);
            edges[i][0] = c1;
            edges[i][1] = c2;
        }

        subtreeSize = new int[n + 1];
        dfs(1, -1);  // Calculate subtree sizes starting from node 1

        for (int i = 0; i < roads; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            // Ensure v is child of u (in subtree structure)
            if (subtreeSize[u] < subtreeSize[v]) {
                int temp = u;
                u = v;
                v = temp;
            }

            int side = subtreeSize[v];
            int revenue = side * (n - side);

            if (revenue > maxRevenue) {
                maxRevenue = revenue;
                cityA = Math.min(u, v);
                cityB = Math.max(u, v);
            } else if (revenue == maxRevenue) {
                int a = Math.min(u, v);
                int b = Math.max(u, v);
                if (a < cityA || (a == cityA && b < cityB)) {
                    cityA = a;
                    cityB = b;
                }
            }
        }

        System.out.println(cityA + " " + cityB);
    }

    // DFS to calculate subtree sizes
    static int dfs(int curr, int parent) {
        subtreeSize[curr] = 1;
        for (int neigh : adj[curr]) {
            if (neigh != parent) {
                subtreeSize[curr] += dfs(neigh, curr);
            }
        }
        return subtreeSize[curr];
    }
}
