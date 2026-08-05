class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Build graph
        for (int[] edge : invocations) {
            graph[edge[0]].add(edge[1]);
        }

        // DFS to mark suspicious methods
        boolean[] visited = new boolean[n];
        dfs(k, graph, visited);

        // Check if any normal method calls a suspicious method
        for (int[] edge : invocations) {
            int u = edge[0];
            int v = edge[1];

            if (!visited[u] && visited[v]) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    ans.add(i);
                }
                return ans;
            }
        }

        // Return remaining (non-suspicious) methods
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ans.add(i);
            }
        }

        return ans;
    }

    private void dfs(int node, List<Integer>[] graph, boolean[] visited) {
        visited[node] = true;

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next, graph, visited);
            }
        }
    }
}