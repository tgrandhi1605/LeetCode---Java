package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    public static boolean courseSchedule(int numOfCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numOfCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] inDegree = new int[numOfCourses];

        for (int[] pair : prerequisites) {
            int course = pair[0];
            int prereq = pair[1];

            graph.get(prereq).add(course);
            inDegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numOfCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int completedCourses = 0;

        while (!queue.isEmpty()) {
            int course = queue.poll();
            completedCourses++;

            for (int neighbour : graph.get(course)) {
                inDegree[neighbour]--;
                if (inDegree[neighbour] == 0) {
                    queue.offer(neighbour);
                }
            }
        }

        return completedCourses == numOfCourses;
    }

    public static void main(String[] args) {
        int[][] prerequisites1 = {{1, 0}};
        int[][] prerequisites2 = {{1, 0}, {0, 1}};

        System.out.println(courseSchedule(2, prerequisites1));
        System.out.println(courseSchedule(2, prerequisites2));
    }
}
