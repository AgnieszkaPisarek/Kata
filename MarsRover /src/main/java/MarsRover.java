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
                    case 'f', 'b' -> go(command);
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

    private void go(char command)   {
        switch (direction) {
            case 'N', 'S' -> {
                if(y == LATITUDE || y == 1)  {
                    x = (x <= LONGITUDE/2) ? (x + LONGITUDE/2) : (x - LONGITUDE/2);
                    direction = (direction == 'N') ? 'S' : 'N';
                }   else {
                    y += (direction == 'N') ? (command == 'f' ? 1 : -1) : (command == 'f' ? -1 : 1);
                }
            }
            case 'E', 'W' -> {
                if(x == LONGITUDE)  {
                    x = 1;
                } else if(x == 1) {
                    x = LONGITUDE;
                } else {
                    x += (command == 'f') ? (direction == 'E' ? 1 : -1) : (direction == 'E' ? -1 : 1);
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
