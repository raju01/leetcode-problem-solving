class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         // Create an adjacency list to represent the graph
        List<List<Integer>> graph = new ArrayList<>(); // graph =[]
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        // graph =   [[],[]]

        // Populate the adjacency list with prerequisites
        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);  //graph.get(0).add(1)
        }

        // Array to keep track of visited nodes during DFS
        int[] visited = new int[numCourses];

        // Perform DFS for each node
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0 && !dfs(graph, visited, i)) {
                return false;
            }
        }

        return true;
    }
    private boolean dfs(List<List<Integer>> graph, int[] visited, int course) {
        // Mark the current node as being visited
        visited[course] = 1;

        // Visit neighbors
        for (int neighbor : graph.get(course)) {
            if (visited[neighbor] == 1) {
                return false; // Cycle detected
            }
            if (visited[neighbor] == 0 && !dfs(graph, visited, neighbor)) {
                return false;
            }
        }

        // Mark the current node as visited and explored
         visited[course] = 2;
        return true;
    }
}