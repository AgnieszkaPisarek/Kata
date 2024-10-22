import java.util.ArrayList;
import java.util.List;

public class MarsRover {
    int x;
    int y;
    char direction;

    List<Character> directionsList = new ArrayList<>();

    public MarsRover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;

        directionsList.add('N');
        directionsList.add('E');
        directionsList.add('S');
        directionsList.add('W');
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    void move(char[] commands) {

        if (commands[0] == 'f')   {
            switch (direction) {
                case 'N' -> y++;
                case 'E' -> x++;
                case 'S' -> y--;
                case 'W' -> x--;
            }
        }

        if (commands[0] == 'b')    {
            switch (direction) {
                case 'N' -> y--;
                case 'E' -> x--;
                case 'S' -> y++;
                case 'W' -> x++;
            }
        }

        if(commands[0] == 'r')  {
            int nextDirection = directionsList.indexOf(direction) + 1;

            if (nextDirection == 4) setDirection(directionsList.getFirst());
            else setDirection(directionsList.get(nextDirection));
        }

        if (commands[0] == 'l')    {
            int nextDirection = directionsList.indexOf(direction) - 1;

            if (nextDirection == -1) setDirection(directionsList.getLast());
            else setDirection(directionsList.get(nextDirection));
        }

    }

}
