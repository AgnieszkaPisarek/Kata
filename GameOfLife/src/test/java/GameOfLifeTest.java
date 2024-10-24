import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class GameOfLifeTest {
    @Test
    public void shouldReadHeightFromTextFile() throws IOException {
        final var GameOfLife = new GameOfLife();
        String filePath = "/home/agnieszka/IdeaProjects/Kata/GameOfLife/src/resources/board1.txt";
        GameOfLife.readFromFile(filePath);
        assertThat(GameOfLife.getHEIGHT()).isEqualTo(4);
    }

    @Test
    public void shouldReadWidthFromTextFile() throws IOException {
        final var GameOfLife = new GameOfLife();
        String filePath = "/home/agnieszka/IdeaProjects/Kata/GameOfLife/src/resources/board1.txt";
        GameOfLife.readFromFile(filePath);
        assertThat(GameOfLife.getWIDTH()).isEqualTo(8);
    }

    @Test
    public void shouldReadLineFromTextFile() throws IOException {
        final var GameOfLife = new GameOfLife();
        String filePath = "/home/agnieszka/IdeaProjects/Kata/GameOfLife/src/resources/board1.txt";
        GameOfLife.readFromFile(filePath);
        char[][] board = GameOfLife.getBoard();
        assertThat(Arrays.equals(board[0], new char[]{'.', '.', '.', '.', '.', '.', '.', '.'})).isTrue();
    }

    @Test
    public void shouldReadBoardFromTextFile() throws IOException {
        final var GameOfLife = new GameOfLife();
        String filePath = "/home/agnieszka/IdeaProjects/Kata/GameOfLife/src/resources/board1.txt";
        GameOfLife.readFromFile(filePath);
        char[][] board = GameOfLife.getBoard();
        assertThat(Arrays.equals(board[0], new char[]{'.', '.', '.', '.', '.', '.', '.', '.'})).isTrue();
        assertThat(Arrays.equals(board[1], new char[]{'.', '.', '.', '.', '*', '.', '.', '.'})).isTrue();
        assertThat(Arrays.equals(board[2], new char[]{'.', '.', '.', '*', '*', '.', '.', '.'})).isTrue();
        assertThat(Arrays.equals(board[3], new char[]{'.', '.', '.', '.', '.', '.', '.', '.'})).isTrue();
    }

    @Test
    public void isACellAlive()  {
        final var GameOfLife = new GameOfLife();
        assertThat(GameOfLife.isAlive('*')).isTrue();
    }

    @Test
    public void isACellDead()  {
        final var GameOfLife = new GameOfLife();
        assertThat(GameOfLife.isAlive('.')).isFalse();
    }

   @Test
    public void shouldCountNeighboursForOneCell() throws IOException {
       final var GameOfLife = new GameOfLife();
       String filePath = "/home/agnieszka/IdeaProjects/Kata/GameOfLife/src/resources/board1.txt";
       GameOfLife.readFromFile(filePath);
       char[][] board = GameOfLife.getBoard();
       assertThat(Arrays.equals(board[0], new char[]{'.', '.', '.', '.', '.', '.', '.', '.'})).isTrue();
       assertThat(Arrays.equals(board[1], new char[]{'.', '.', '.', '.', '*', '.', '.', '.'})).isTrue();
       assertThat(Arrays.equals(board[2], new char[]{'.', '.', '.', '*', '*', '.', '.', '.'})).isTrue();
       assertThat(Arrays.equals(board[3], new char[]{'.', '.', '.', '.', '.', '.', '.', '.'})).isTrue();

       assertThat(GameOfLife.countNeighbors(1,4)).isEqualTo(2);
   }

    @Test
    public void underpopulatedCellDies_whenThereAreLessThanTwoCellsAround() throws IOException {
        final var GameOfLife = new GameOfLife();
        String filePath = "/home/agnieszka/IdeaProjects/Kata/GameOfLife/src/resources/underpopulatedCells.txt";
        GameOfLife.readFromFile(filePath);
        GameOfLife.playGameOfLife();
        char[][] board = GameOfLife.getBoard();
        assertThat(board[2][3]).isEqualTo('.');
    }

    @Test
    public void overcrowdedCellDies_whenThereAreMoreThanThreeLivingCellsAround() throws IOException {
        final var GameOfLife = new GameOfLife();
        String filePath = "/home/agnieszka/IdeaProjects/Kata/GameOfLife/src/resources/overcrowdedCells.txt";
        GameOfLife.readFromFile(filePath);
        GameOfLife.playGameOfLife();
        char[][] board = GameOfLife.getBoard();
        assertThat(board[2][3]).isEqualTo('.');
    }

    @Test
    public void cellShouldAwaken_whenThereAreThreeLiveNeighbours() throws IOException {
        final var GameOfLife = new GameOfLife();
        String filePath = "/home/agnieszka/IdeaProjects/Kata/GameOfLife/src/resources/canAwakenCell.txt";
        GameOfLife.readFromFile(filePath);
        GameOfLife.playGameOfLife();
        char[][] board = GameOfLife.getBoard();
        assertThat(board[2][3]).isEqualTo('*');
    }

    @Test
    public void checkIfXIsInTheGrid() throws IOException {
        final var GameOfLife = new GameOfLife();
        String filePath = "/home/agnieszka/IdeaProjects/Kata/GameOfLife/src/resources/canAwakenCell.txt";
        GameOfLife.readFromFile(filePath);
        assertThat(GameOfLife.checkIfInTheGrid(-1, 0)).isEqualTo(false);
        assertThat(GameOfLife.checkIfInTheGrid(10, 0)).isEqualTo(false);
        assertThat(GameOfLife.checkIfInTheGrid(2, 2)).isEqualTo(true);
    }

    @Test
    public void checkIfYIsInTheGrid() throws IOException {
        final var GameOfLife = new GameOfLife();
        String filePath = "/home/agnieszka/IdeaProjects/Kata/GameOfLife/src/resources/canAwakenCell.txt";
        GameOfLife.readFromFile(filePath);
        assertThat(GameOfLife.checkIfInTheGrid(2, -1)).isEqualTo(false);
        assertThat(GameOfLife.checkIfInTheGrid(2, 8)).isEqualTo(false);
        assertThat(GameOfLife.checkIfInTheGrid(3, 3)).isEqualTo(true);
    }

    @Test
    public void shouldBeWorkingForEntireBoard() throws IOException {
        final var GameOfLife = new GameOfLife();
        String filePath = "/home/agnieszka/IdeaProjects/Kata/GameOfLife/src/resources/board1.txt";
        GameOfLife.readFromFile(filePath);
        GameOfLife.playGameOfLife();
        char[][] board = GameOfLife.getBoard();
        GameOfLife.writeToFile(filePath);
        assertThat(Arrays.equals(board[0], new char[]{'.', '.', '.', '.', '.', '.', '.', '.'})).isTrue();
        assertThat(Arrays.equals(board[1], new char[]{'.', '.', '.', '*', '*', '.', '.', '.'})).isTrue();
        assertThat(Arrays.equals(board[2], new char[]{'.', '.', '.', '*', '*', '.', '.', '.'})).isTrue();
        assertThat(Arrays.equals(board[3], new char[]{'.', '.', '.', '.', '.', '.', '.', '.'})).isTrue();
    }




}