import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GameOfLife {

    private int WIDTH;
    private int HEIGHT;
    private char[][] board;

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
        var scanner = new Scanner(file);
        HEIGHT = scanner.nextInt();
        WIDTH = scanner.nextInt();
        scanner.nextLine();
        board = new char[WIDTH][HEIGHT];
        int lines = 0;
        while(scanner.hasNextLine()) {
            board[lines] = scanner.nextLine().toCharArray();
            lines++;
        }
        scanner.close();
    }

   public boolean isAlive(char cell)    {
        return cell == '*';
   }

   public int countNeighbors(int x, int y) {
        int neighbors = 0;
        for(int i = x - 1; i <= x + 1; i++)   {
            for(int j = y - 1; j <= y + 1; j++)   {
                if(i == x && j == y)  continue;
                if(board[i][j] == '*')   neighbors++;
            }
        }
        return neighbors;
   }

   public void checkLivingConditions(int x, int y)  {
        int neighbors = countNeighbors(x, y);
        if(neighbors < 2 || neighbors > 3) board[x][y] = '.';
   }

    public void checkIfCellCanAwaken(int x, int y)  {
        int neighbors = countNeighbors(x, y);
        if(neighbors == 3) board[x][y] = '*';
    }

    public boolean checkIfInTheGrid(int x, int y) {
        return (x >= 0 && y >= 0 && x <= WIDTH - 1 && y <= HEIGHT - 1);
    }


}
