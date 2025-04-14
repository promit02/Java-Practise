import java.util.*;

public class GridPathFinder {

    // Method to find the shortest path from 'S' to 'D' using BFS
    public static int getShortestPath(char[][] map, int gridSize) {
        int[] rowDir = {1, -1, 0, 0}; // Row direction changes
        int[] colDir = {0, 0, 1, -1}; // Column direction changes
        int startRow = -1, startCol = -1, destRow = -1, destCol = -1;

        // Locate the starting ('S') and destination ('D') positions
        for (int r = 0; r < gridSize; r++) {
            for (int c = 0; c < gridSize; c++) {
                if (map[r][c] == 'S') {
                    startRow = r;
                    startCol = c;
                }
                if (map[r][c] == 'D') {
                    destRow = r;
                    destCol = c;
                }
            }
        }

        // Initialize BFS queue and visited array
        Queue<int[]> bfsQueue = new ArrayDeque<>();
        boolean[][] isVisited = new boolean[gridSize][gridSize];
        bfsQueue.add(new int[]{startRow, startCol, 0});
        isVisited[startRow][startCol] = true;

        // Process BFS queue
        while (!bfsQueue.isEmpty()) {
            int[] current = bfsQueue.poll();
            int row = current[0], col = current[1], dist = current[2];

            if (row == destRow && col == destCol) {
                return dist; // Reached the destination
            }

            // Explore all possible directions
            for (int d = 0; d < 4; d++) {
                int newRow = row + rowDir[d];
                int newCol = col + colDir[d];
                if (newRow >= 0 && newRow < gridSize && newCol >= 0 && newCol < gridSize 
                    && !isVisited[newRow][newCol] && map[newRow][newCol] != 'T') {
                    isVisited[newRow][newCol] = true;
                    bfsQueue.add(new int[]{newRow, newCol, dist + 1});
                }
            }
        }
        return Integer.MAX_VALUE; // No valid path found
    }

    // Method to extract smaller MxM grids from the main NxN map
    public static List<char[][]> splitGrid(char[][] map, int gridSize, int subGridSize) {
        List<char[][]> subGrids = new ArrayList<>();

        for (int r = 0; r < gridSize; r += subGridSize) {
            for (int c = 0; c < gridSize; c += subGridSize) {
                char[][] subGrid = new char[subGridSize][subGridSize];
                for (int i = 0; i < subGridSize; i++) {
                    System.arraycopy(map[r + i], c, subGrid[i], 0, subGridSize);
                }
                subGrids.add(subGrid);
            }
        }
        return subGrids;
    }

    // Method to reconstruct the main grid from subGrids based on a given order
    public static char[][] buildGrid(List<Integer> order, List<char[][]> subGrids, int gridSize, int subGridSize) {
        char[][] finalGrid = new char[gridSize][gridSize];
        int gridsPerRow = gridSize / subGridSize;

        for (int idx = 0; idx < order.size(); idx++) {
            int gridIdx = order.get(idx);
            char[][] subGrid = subGrids.get(gridIdx);
            int baseRow = (idx / gridsPerRow) * subGridSize;
            int baseCol = (idx % gridsPerRow) * subGridSize;

            for (int i = 0; i < subGridSize; i++) {
                System.arraycopy(subGrid[i], 0, finalGrid[baseRow + i], baseCol, subGridSize);
            }
        }
        return finalGrid;
    }

    // Main solver to compute the minimum distance from 'S' to 'D'
    public static int findMinDistance() {
        Scanner input = new Scanner(System.in);

        // Read grid dimensions and sub-grid size
        int gridSize = input.nextInt();
        int subGridSize = input.nextInt();
        input.nextLine(); // Consume newline

        char[][] map = new char[gridSize][gridSize];

        // Read grid data
        for (int i = 0; i < gridSize; i++) {
            map[i] = input.nextLine().toCharArray();
        }

        List<char[][]> subGrids = splitGrid(map, gridSize, subGridSize);

        int totalGrids = (gridSize / subGridSize) * (gridSize / subGridSize);
        int startGrid = -1, destGrid = -1;

        // Locate grids containing 'S' and 'D'
        for (int i = 0; i < subGrids.size(); i++) {
            char[][] subGrid = subGrids.get(i);
            for (int r = 0; r < subGridSize; r++) {
                for (int c = 0; c < subGridSize; c++) {
                    if (subGrid[r][c] == 'S') startGrid = i;
                    if (subGrid[r][c] == 'D') destGrid = i;
                }
            }
        }

        List<Integer> otherGrids = new ArrayList<>();
        for (int i = 0; i < totalGrids; i++) {
            if (i != startGrid && i != destGrid) {
                otherGrids.add(i);
            }
        }

        List<List<Integer>> permutedOrders = new ArrayList<>();
        generateArrangements(otherGrids, 0, permutedOrders);

        int minDistance = Integer.MAX_VALUE;

        for (List<Integer> order : permutedOrders) {
            List<Integer> fullOrder = new ArrayList<>();
            fullOrder.add(startGrid);
            fullOrder.addAll(order);
            fullOrder.add(destGrid);

            char[][] reorderedMap = buildGrid(fullOrder, subGrids, gridSize, subGridSize);
            minDistance = Math.min(minDistance, getShortestPath(reorderedMap, gridSize));
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }

    // Recursive method to generate all arrangements of a list
    public static void generateArrangements(List<Integer> items, int idx, List<List<Integer>> results) {
        if (idx == items.size()) {
            results.add(new ArrayList<>(items));
        } else {
            for (int i = idx; i < items.size(); i++) {
                Collections.swap(items, i, idx);
                generateArrangements(items, idx + 1, results);
                Collections.swap(items, i, idx);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print(findMinDistance());
    }
}