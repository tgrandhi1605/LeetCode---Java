package Advanced;

import java.util.*;

public class PackageDependency {
    public static List<String> packageDependency(List<String> packages, List<String[]> dependencies) throws Exception {
        Map<String, List<String>> dependencyMapping = new HashMap<>();

        for (String p : packages) {
            dependencyMapping.put(p, new ArrayList<>());
        }

        for (String[] d : dependencies) {
            String dependent = d[0];
            String dependency = d[1];
            dependencyMapping.get(dependent).add(dependency);
        }

        List<String> order = new ArrayList<>();
        Set<String> completed = new HashSet<>();

        while (completed.size() < packages.size()) {
            boolean progress = false;

            for (String p : packages) {
                if (completed.contains(p)) continue;

                List<String> mustHave = dependencyMapping.get(p);
                if (completed.containsAll(mustHave)) {
                    order.add(p);
                    completed.add(p);
                    progress = true;
                }
            }
            if (!progress) {
                throw new Exception("Circular dependency occurred!!!");
            }
        }
        return order;
    }

    public static void main(String[] args) {
        List<String> packages = Arrays.asList("A", "B", "C", "D");
        List<String[]> dependencies = Arrays.asList(
                new String[]{"B", "A"}, // B needs A
                new String[]{"C", "A"}, // C needs A
                new String[]{"D", "B"},
                new String[]{"D", "A"}
        );

        try {
            List<String> dependencyOrder = packageDependency(packages, dependencies);
            System.out.println(dependencyOrder);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
