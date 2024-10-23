import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverObstacleTest {
    @Test
    void returnObstacle_whenTheSequenceIsNotValid()    {
        final var MarsRover = new MarsRover(0, 0, 'N');
        assertThat(MarsRover.reportTheObstacle('k')).isEqualTo(true);
    }

    @Test
    void returnToStartingPoint_whenTheSequenceIsNotValid()    {
        final var MarsRover = new MarsRover(1, 5, 'N');
        MarsRover.move(new char[]{'f', 'f', 'r', 'l', 'k', 'l'});
        assertThat(MarsRover.getX()).isEqualTo(1);
        assertThat(MarsRover.getY()).isEqualTo(5);
        assertThat(MarsRover.getDirection()).isEqualTo('N');
    }

}