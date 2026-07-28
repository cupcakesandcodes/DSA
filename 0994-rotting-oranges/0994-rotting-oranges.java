class Solution {
    public int orangesRotting(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int fresh = 0;

        Queue<int[]> q = new LinkedList<>();


        // Add rotten oranges and count fresh oranges
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
                else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }


        int minutes = 0;


        int[][] direction = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };


        while (!q.isEmpty() && fresh > 0) {


            int size = q.size();

            minutes++;


            for (int i = 0; i < size; i++) {


                int[] curr = q.poll();

                int row = curr[0];
                int col = curr[1];


                for (int[] dir : direction) {


                    int newRow = row + dir[0];
                    int newCol = col + dir[1];


                    if (newRow >= 0 && newRow < m &&
                        newCol >= 0 && newCol < n &&
                        grid[newRow][newCol] == 1) {


                        grid[newRow][newCol] = 2;

                        fresh--;

                        q.add(new int[]{newRow, newCol});
                    }
                }
            }
        }


        if (fresh > 0)
            return -1;


        return minutes;
    }
}