class Solution1 {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1 && visited[i][j] == 0) {
                    maxArea = Math.max(maxArea, coverIsland(grid, i, j, visited));
                }
            }            
        }
        return maxArea;
    }

    public int coverIsland(int[][] grid, int i, int j, int[][] visited) {
        int m = grid.length;
        int n = grid[0].length;
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return 0;
        }
        if(visited[i][j] == 1) {
            return 0;
        }
        visited[i][j] = 1;
        return (1 + coverIsland(grid,i,j-1,visited)+
                    coverIsland(grid,i-1,j,visited)+
                    coverIsland(grid,i,j+1,visited)+
                    coverIsland(grid,i+1,j,visited));                 
    }
}