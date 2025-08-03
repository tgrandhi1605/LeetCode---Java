package Graphs;

public class IslandCount {
    public static int islandCount(char[][] grid) {
        int count = 0;
        int rows = grid.length;
        int columns = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (grid[r][c] == '1') {
                    count++;
                    dfs(grid, r, c);
                }
            }

        }
        return count;
    }

    public static void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) return;

        grid[r][c] = 0;

        dfs(grid, r - 1, c); // left
        dfs(grid, r + 1, c); // right
        dfs(grid, r, c - 1); // up
        dfs(grid, r, c + 1); // down
    }

    public static void main(String[] args) {
        char[][] grid =
                {{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        System.out.println(islandCount(grid));
    }
}
