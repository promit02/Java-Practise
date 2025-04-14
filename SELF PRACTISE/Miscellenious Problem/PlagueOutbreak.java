import java.util.*;

public class PlagueOutbreak {
    static int N;
    static char[][] grid;
    static int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } }; // Up, Down, Left, Right

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of grid
        N = sc.nextInt();
        sc.nextLine();

        // Input grid and find the start and destination coordinates
        grid = new char[N][N];
        int startX = -1, startY = -1, destX = -1, destY = -1;

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < N; j++) {
                grid[i][j] = line.charAt(j);
                if (grid[i][j] == 's') {
                    startX = i;
                    startY = j;
                    grid[i][j] = '0'; // Treat 's' as uninfected
                } else if (grid[i][j] == 'd') {
                    destX = i;
                    destY = j;
                    grid[i][j] = '0'; // Treat 'd' as uninfected
                }
            }
        }

        // Perform BFS to find the minimum number of days
        int result = findMinDays(startX, startY, destX, destY);
        System.out.println(result);
    }

    // BFS to find the minimum days
    static int findMinDays(int startX, int startY, int destX, int destY) {
        Queue<State> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(new State(startX, startY, 0, grid));
        visited.add(startX + "," + startY + ",0");

        while (!queue.isEmpty()) {
            State current = queue.poll();

            // Check if we've reached the destination
            if (current.x == destX && current.y == destY) {
                return current.day;
            }

            // Simulate the grid for the next day
            char[][] nextDayGrid = simulateNextDay(current.grid);

            // Check all possible moves (stay or move to adjacent cities)
            for (int[] dir : directions) {
                int nx = current.x + dir[0];
                int ny = current.y + dir[1];

                if (isValid(nx, ny, nextDayGrid)) {
                    String stateKey = nx + "," + ny + "," + (current.day + 1);
                    if (!visited.contains(stateKey)) {
                        visited.add(stateKey);
                        queue.offer(new State(nx, ny, current.day + 1, nextDayGrid));
                    }
                }
            }

            // Option to stay in the current city
            if (isValid(current.x, current.y, nextDayGrid)) {
                String stateKey = current.x + "," + current.y + "," + (current.day + 1);
                if (!visited.contains(stateKey)) {
                    visited.add(stateKey);
                    queue.offer(new State(current.x, current.y, current.day + 1, nextDayGrid));
                }
            }
        }

        // If destination is unreachable (shouldn't happen as per constraints)
        return -1;
    }

    // Check if a city is valid to stay or move to
    static boolean isValid(int x, int y, char[][] nextDayGrid) {
        return x >= 0 && x < N && y >= 0 && y < N && nextDayGrid[x][y] == '0';
    }

    // Simulate the grid for the next day
    static char[][] simulateNextDay(char[][] currentGrid) {
        char[][] nextGrid = new char[N][N];
        int[][] directions8 = {
                { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 }
        }; // 8 neighbors

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int infectedNeighbors = 0;
                for (int[] dir : directions8) {
                    int nx = i + dir[0];
                    int ny = j + dir[1];
                    if (nx >= 0 && nx < N && ny >= 0 && ny < N && currentGrid[nx][ny] == '1') {
                        infectedNeighbors++;
                    }
                }

                // Apply plague spread rules
                if (currentGrid[i][j] == '0') {
                    nextGrid[i][j] = (infectedNeighbors == 3) ? '1' : '0';
                } else if (currentGrid[i][j] == '1') {
                    nextGrid[i][j] = (infectedNeighbors == 2 || infectedNeighbors == 3) ? '1' : '0';
                }
            }
        }

        return nextGrid;
    }

    // State class to represent a BFS node
    static class State {
        int x, y, day;
        char[][] grid;

        State(int x, int y, int day, char[][] grid) {
            this.x = x;
            this.y = y;
            this.day = day;
            this.grid = deepCopy(grid);
        }

        // Deep copy a grid
        char[][] deepCopy(char[][] original) {
            char[][] copy = new char[original.length][original[0].length];
            for (int i = 0; i < original.length; i++) {
                copy[i] = original[i].clone();
            }
            return copy;
        }
    }
}
