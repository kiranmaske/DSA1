import java.util.*;

class Solution {
    public double[] calcEquation(
        List<List<String>> equations,
        double[] values,
        List<List<String>> queries) {

        // Create an adjacency list
        Map<String, Map<String, Double>> graph = new HashMap<>();

        // Build the graph
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);

            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());

            graph.get(a).put(b, values[i]);
            graph.get(b).put(a, 1.0 / values[i]);
        }

        double[] result = new double[queries.size()];

        // Process each query
        for (int i = 0; i < queries.size(); i++) {
            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);

            if (!graph.containsKey(start) || !graph.containsKey(end)) {
                result[i] = -1.0;
            } else {
                result[i] = dfs(start, end, graph, new HashSet<>());
            }
        }

        return result;
    }

    private double dfs(
        String start,
        String end,
        Map<String, Map<String, Double>> graph,
        Set<String> visited) {

        if (start.equals(end)) {
            return 1.0;
        }

        visited.add(start);

        for (String neighbor : graph.get(start).keySet()) {

            if (!visited.contains(neighbor)) {

                double weight = graph.get(start).get(neighbor);

                double result = dfs(neighbor, end, graph, visited);

                if (result != -1.0) {
                    return weight * result;
                }
            }
        }

        return -1.0;
    }
}
