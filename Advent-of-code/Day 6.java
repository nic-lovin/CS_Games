import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Solution {

    private static final int GRID_SIZE = 1000;
    private static enum operation {turnOn, turnOff, toggle};

    private static int[][] refreshGrid(int grid[][], int x1, int x2, int y1, int y2, operation oper) {
        int[][] newGrid = grid;

        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if (oper == operation.turnOn) newGrid[i][j] = 1;
                else if (oper == operation.turnOff) newGrid[i][j] = 0;
                else {
                    if (newGrid[i][j] == 1) {
                        newGrid[i][j] = 0;
                    } else {
                        newGrid[i][j] = 1;
                    }
                }
            }
        }
        return newGrid;
    }
    
    public static void main(String[] args) {
        int[][] grid = new int[GRID_SIZE][GRID_SIZE];

        String line = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));

            while((line = br.readLine()) != null) {
                operation oper;

                // Genre de fonction qui pourrait être optimisée
                line = line.replace(" through ", ",");
                if (line.contains("turn on")) {
                    line = line.replace("turn on ", ""); // On veut juste garder les chiffres
                    oper = operation.turnOn;
                } else if (line.contains("turn off")) {
                    line = line.replace("turn off ", "");
                    oper = operation.turnOff;
                } else {
                    line = line.replace("toggle ", "");
                    oper = operation.toggle;
                }
                String[] xy = line.split(",");
                grid = refreshGrid(grid,
                        Integer.parseInt(xy[0]), // Pis on veut juste des int, pas des strings
                        Integer.parseInt(xy[2]),
                        Integer.parseInt(xy[1]),
                        Integer.parseInt(xy[3]),
                        oper);
            }
            //Une fois qu'on a traité toutes les lignes...
            int count = 0;
            for (int i = 0; i < GRID_SIZE; i++) {
                for (int j = 0; j < GRID_SIZE; j++) {
                    if (grid[i][j] == 1) {
                        count++;
                    }
                }
            }
            System.out.println(count);

            br.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Fichier introuvable");
        }
        catch(IOException ex) {
            System.out.println("Yolo, ça a planté");
        }
    }
}
