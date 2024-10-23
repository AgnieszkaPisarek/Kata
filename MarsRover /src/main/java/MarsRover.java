import java.util.ArrayList;
import java.util.List;

public class MarsRover {
    int x;
    int y;
    char direction;
    final int LONGITUDE = 8;
    final int LATITUDE = 8;

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
                case 'N' -> {
                    if(y == 1)  {
                        x = (x <= LONGITUDE/2) ? (x + LONGITUDE/2) : (x - LONGITUDE/2);
                        direction = 'S';
                    }   else {
                        y++;
                    }
                }
                case 'E' -> {
                    if (x == LONGITUDE) {
                        x = 1;
                    } else {
                        x++;
                    }
                }
                case 'S' -> y--;
                case 'W' -> {
                    if(x == 1)  {
                        x = LONGITUDE;
                    }   else {
                        x--;
                    }
                }
            }
        }

        if (commands[0] == 'b')    {
            switch (direction) {
                case 'N' -> y--;
                case 'E' -> {
                    if(x == 1)  {
                        x = LONGITUDE;
                    }   else {
                        x--;
                    }
                }
                case 'S' -> {
                    if(y == 1)  {
                        x = (x <= LONGITUDE/2) ? (x + LONGITUDE/2) : (x - LONGITUDE/2);
                        direction = 'N';
                    }   else {
                        y++;
                    }
                }
                case 'W' -> {
                    if(x == LONGITUDE)  {
                        x = 1;
                    }   else {
                        x++;
                    }
                }
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
