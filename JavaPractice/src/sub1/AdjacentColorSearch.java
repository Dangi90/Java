package sub1;

public class AdjacentColorSearch {
    
    public static void main(String[] args) {
        char[][] grid = {
            {'R', 'G', 'B'},
            {'G', 'R', 'R'},
            {'B', 'G', 'R'}
        };

        int x = 1; // 탐색할 행
        int y = 1; // 탐색할 열
        getAdjacentColors(grid, x, y);
    }

    public static void getAdjacentColors(char[][] grid, int x, int y) {
        // 인접한 방향 정의 (상, 하, 좌, 우)
        int[][] directions = {
            {-1, 0}, // 상
            {1, 0},  // 하
            {0, -1}, // 좌
            {0, 1}   // 우
        };

        // 주어진 위치의 색상
        char targetColor = grid[x][y];
        
        System.out.println("주어진 위치의 색상: " + targetColor);
        
        for (int[] direction : directions) {
            int nx = x + direction[0];
            int ny = y + direction[1];

            // 인덱스가 유효한지 확인
            if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length) {
                char adjacentColor = grid[nx][ny];
                System.out.println("인접한 위치 (" + nx + ", " + ny + ") 색상: " + adjacentColor);

                // 색상 비교
                if (adjacentColor == targetColor) {
                    System.out.println("인접한 같은 색상 발견: 위치 (" + nx + ", " + ny + ") 색상: " + adjacentColor);
                }
            }
        }
    }
}

