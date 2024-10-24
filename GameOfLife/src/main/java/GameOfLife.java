import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GameOfLife {

    private int WIDTH;
    private int HEIGHT;
    private char[][] board;
    private char[][] nextGenerationBoard;
    private final char ALIVE_CELL = '*';
    private final char DEAD_CELL = '.';

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public char[][] getBoard() {
        return board;
    }

    public void readFromFile(String filePath) throws IOException {
        var file = new File(filePath);
        try (var scanner = new Scanner(file)) {
            HEIGHT = scanner.nextInt();
            WIDTH = scanner.nextInt();
            scanner.nextLine();
            board = new char[HEIGHT][WIDTH];
            nextGenerationBoard = new char[HEIGHT][WIDTH];
            for (int i = 0; i < HEIGHT; i++) {
                board[i] = scanner.nextLine().toCharArray();
            }
        }
    }

   public boolean isAlive(char cell)    {
        return cell == ALIVE_CELL;
   }

   public int countNeighbors(int x, int y) {
        int neighbors = 0;
        for(int i = x - 1; i <= x + 1; i++)   {
            for(int j = y - 1; j <= y + 1; j++)   {
                if(i == x && j == y)  continue;
                if(checkIfInTheGrid(i, j)) {
                    if (board[i][j] == ALIVE_CELL) neighbors++;
                }
            }
        }
        return neighbors;
   }

   public void checkLivingConditions(int x, int y)  {
        int neighbors = countNeighbors(x, y);
        if(neighbors < 2 || neighbors > 3) nextGenerationBoard[x][y] = DEAD_CELL;
   }

    public void checkIfCellCanAwaken(int x, int y)  {
        int neighbors = countNeighbors(x, y);
        if(neighbors == 3) nextGenerationBoard[x][y] = ALIVE_CELL;
    }

    public boolean checkIfInTheGrid(int x, int y) {
        return (x >= 0 && y >= 0 && y <= WIDTH - 1 && x <= HEIGHT - 1);
    }

    public void playGameOfLife()    {
        for(int x = 0; x < HEIGHT; x++) {
            for(int y = 0; y < WIDTH; y++) {
                nextGenerationBoard[x][y] = board[x][y];

                if(isAlive(nextGenerationBoard[x][y])) checkLivingConditions(x, y);
                else checkIfCellCanAwaken(x, y);
            }
        }
        board = nextGenerationBoard.clone();
        displayGrid();
    }

    public void writeToFile(String filePath) throws IOException {
        var file = new File(filePath);
        try(var fileWriter = new FileWriter(file))  {
            fileWriter.write(HEIGHT + " " + WIDTH + "\n");

            for(int i = 0; i < HEIGHT; i++) {
                fileWriter.write(board[i]);
                fileWriter.write("\n");
            }
        }
    }

    public void displayGrid()  {
        for(int x = 0; x < HEIGHT; x++) {
            for(int y = 0; y < WIDTH; y++) {
                System.out.print(board[x][y]);
            }
            System.out.println("\n");
        }
    }



}
