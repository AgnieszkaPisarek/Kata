import java.util.ArrayList;
import java.util.List;

public class MarsRover {
    int x;
    int y;
    char direction;
    final int LONGITUDE = 8;
    final int LATITUDE = 8;

    final char[] commandsKnown = new char[]{'f','b','l','r'};
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

        int startingX = x;
        int startingY = y;
        char startingDirection = direction;

        for(char command : commands) {
            if (!reportTheObstacle(command)) {
                switch (command) {
                    case 'f' -> goForward();
                    case 'b' -> goBackward();
                    case 'r' -> turnRight();
                    case 'l' -> turnLeft();
                }
            }   else {
                x = startingX;
                y = startingY;
                direction = startingDirection;
                break;
            }
        }
    }

    private void goForward() {
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
            case 'S' -> {
                if(y == LATITUDE)  {
                    x = (x <= LONGITUDE/2) ? (x + LONGITUDE/2) : (x - LONGITUDE/2);
                    direction = 'N';
                }   else {
                    y--;
                }
            }
            case 'W' -> {
                if(x == 1)  {
                    x = LONGITUDE;
                }   else {
                    x--;
                }
            }
        }
    }

    private void goBackward() {
        switch (direction) {
            case 'N' -> {
                if(y == LATITUDE)  {
                    x = (x <= LONGITUDE/2) ? (x + LONGITUDE/2) : (x - LONGITUDE/2);
                    direction = 'S';
                }   else {
                    y--;
                }
            }
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

    private void turnRight() {
        int nextDirection = directionsList.indexOf(direction) + 1;

        if (nextDirection == 4) setDirection(directionsList.getFirst());
        else setDirection(directionsList.get(nextDirection));
    }

    private void turnLeft() {
        int nextDirection = directionsList.indexOf(direction) - 1;

        if (nextDirection == -1) setDirection(directionsList.getLast());
        else setDirection(directionsList.get(nextDirection));
    }

    public boolean reportTheObstacle(char commands) {
        for(char commandKnown : commandsKnown) {
            if (commandKnown == commands) {
                return false;
            }
        }
        System.out.println("Obstacle faced. Returning to starting point...");
        return true;
    }

}
