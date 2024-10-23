import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {

    @Test
    void shouldMoveForwardInTheNDirection()    {
        final var MarsRover = new MarsRover(0, 0, 'N');
        MarsRover.move(new char[]{'f'});
        assertThat(MarsRover.getX()).isEqualTo(0);
        assertThat(MarsRover.getY()).isEqualTo(1);
        assertThat(MarsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveBackwardInTheSDirection()    {
        final var MarsRover = new MarsRover(0, 0, 'N');
        MarsRover.move(new char[]{'b'});
        assertThat(MarsRover.getX()).isEqualTo(0);
        assertThat(MarsRover.getY()).isEqualTo(-1);
        assertThat(MarsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldTurnRight_whenGivenR()    {
        final var MarsRover = new MarsRover(0, 0, 'N');
        MarsRover.move(new char[]{'r'});
        assertThat(MarsRover.getX()).isEqualTo(0);
        assertThat(MarsRover.getY()).isEqualTo(0);
        assertThat(MarsRover.getDirection()).isEqualTo('E');
    }

    @Test
    void shouldTurnRight_whenDirectionIsE()    {
        final var MarsRover = new MarsRover(0, 0, 'E');
        MarsRover.move(new char[]{'r'});
        assertThat(MarsRover.getX()).isEqualTo(0);
        assertThat(MarsRover.getY()).isEqualTo(0);
        assertThat(MarsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldTurnRight_whenDirectionIsS()    {
        final var MarsRover = new MarsRover(0, 0, 'S');
        MarsRover.move(new char[]{'r'});
        assertThat(MarsRover.getX()).isEqualTo(0);
        assertThat(MarsRover.getY()).isEqualTo(0);
        assertThat(MarsRover.getDirection()).isEqualTo('W');
    }

    @Test
    void shouldTurnRight_whenDirectionIsW()    {
        final var MarsRover = new MarsRover(0, 0, 'W');
        MarsRover.move(new char[]{'r'});
        assertThat(MarsRover.getX()).isEqualTo(0);
        assertThat(MarsRover.getY()).isEqualTo(0);
        assertThat(MarsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldTurnLeft_whenGivenL()    {
        final var MarsRover = new MarsRover(0, 0, 'N');
        MarsRover.move(new char[]{'l'});
        assertThat(MarsRover.getX()).isEqualTo(0);
        assertThat(MarsRover.getY()).isEqualTo(0);
        assertThat(MarsRover.getDirection()).isEqualTo('W');
    }

    @Test
    void shouldTurnLeft_whenDirectionIsE()    {
        final var MarsRover = new MarsRover(0, 0, 'E');
        MarsRover.move(new char[]{'l'});
        assertThat(MarsRover.getX()).isEqualTo(0);
        assertThat(MarsRover.getY()).isEqualTo(0);
        assertThat(MarsRover.getDirection()).isEqualTo('N');
    }


    @Test
    void shouldTurnLeft_whenDirectionIsS()    {
        final var MarsRover = new MarsRover(0, 0, 'S');
        MarsRover.move(new char[]{'l'});
        assertThat(MarsRover.getX()).isEqualTo(0);
        assertThat(MarsRover.getY()).isEqualTo(0);
        assertThat(MarsRover.getDirection()).isEqualTo('E');
    }

    @Test
    void shouldTurnLeft_whenDirectionIsW()    {
        final var MarsRover = new MarsRover(0, 0, 'W');
        MarsRover.move(new char[]{'l'});
        assertThat(MarsRover.getX()).isEqualTo(0);
        assertThat(MarsRover.getY()).isEqualTo(0);
        assertThat(MarsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveForwardInTheEDirection()    {
        final var MarsRover = new MarsRover(0, 0, 'E');
        MarsRover.move(new char[]{'f'});
        assertThat(MarsRover.getX()).isEqualTo(1);
        assertThat(MarsRover.getY()).isEqualTo(0);
        assertThat(MarsRover.getDirection()).isEqualTo('E');
    }

    @Test
    void shouldMoveForwardInTheSDirection()    {
        final var MarsRover = new MarsRover(0, 0, 'S');
        MarsRover.move(new char[]{'f'});
        assertThat(MarsRover.getX()).isEqualTo(0);
        assertThat(MarsRover.getY()).isEqualTo(-1);
        assertThat(MarsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveForwardInTheWDirection()    {
        final var MarsRover = new MarsRover(0, 0, 'W');
        MarsRover.move(new char[]{'f'});
        assertThat(MarsRover.getX()).isEqualTo(-1);
        assertThat(MarsRover.getY()).isEqualTo(0);
        assertThat(MarsRover.getDirection()).isEqualTo('W');
    }

    @Test
    void shouldMoveBackwardInTheNDirection()    {
        final var MarsRover = new MarsRover(0, 0, 'S');
        MarsRover.move(new char[]{'b'});
        assertThat(MarsRover.getX()).isEqualTo(0);
        assertThat(MarsRover.getY()).isEqualTo(1);
        assertThat(MarsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveBackwardInTheEDirection()    {
        final var MarsRover = new MarsRover(0, 0, 'W');
        MarsRover.move(new char[]{'b'});
        assertThat(MarsRover.getX()).isEqualTo(1);
        assertThat(MarsRover.getY()).isEqualTo(0);
        assertThat(MarsRover.getDirection()).isEqualTo('W');
    }

    @Test
    void shouldMoveBackwardInTheWDirection()    {
        final var MarsRover = new MarsRover(0, 0, 'E');
        MarsRover.move(new char[]{'b'});
        assertThat(MarsRover.getX()).isEqualTo(-1);
        assertThat(MarsRover.getY()).isEqualTo(0);
        assertThat(MarsRover.getDirection()).isEqualTo('E');
    }

    @Test
    void shouldMoveToEight_whenGoingBackwardsFromOne()    {
        final var MarsRover = new MarsRover(1, 1, 'E');
        MarsRover.move(new char[]{'b'});
        assertThat(MarsRover.getX()).isEqualTo(8);
        assertThat(MarsRover.getY()).isEqualTo(1);
        assertThat(MarsRover.getDirection()).isEqualTo('E');
    }

    @Test
    void shouldMoveToOne_whenGoingForwardFromEight()    {
        final var MarsRover = new MarsRover(8, 1, 'E');
        MarsRover.move(new char[]{'f'});
        assertThat(MarsRover.getX()).isEqualTo(1);
        assertThat(MarsRover.getY()).isEqualTo(1);
        assertThat(MarsRover.getDirection()).isEqualTo('E');
    }

    @Test
    void shouldMoveToOne_whenGoingBackwardFromEightFacingW()    {
        final var MarsRover = new MarsRover(8, 1, 'W');
        MarsRover.move(new char[]{'b'});
        assertThat(MarsRover.getX()).isEqualTo(1);
        assertThat(MarsRover.getY()).isEqualTo(1);
        assertThat(MarsRover.getDirection()).isEqualTo('W');
    }

    @Test
    void shouldMoveToEight_whenGoingForwardFromOneFacingW()    {
        final var MarsRover = new MarsRover(1, 1, 'W');
        MarsRover.move(new char[]{'f'});
        assertThat(MarsRover.getX()).isEqualTo(MarsRover.LONGITUDE);
        assertThat(MarsRover.getY()).isEqualTo(1);
        assertThat(MarsRover.getDirection()).isEqualTo('W');
    }


    @Test
    void shouldMoveToOpposite_whenGoingAcrossThePole()    {
        final var MarsRover = new MarsRover(3, 1, 'N');
        MarsRover.move(new char[]{'f'});
        assertThat(MarsRover.getX()).isEqualTo(7);
        assertThat(MarsRover.getY()).isEqualTo(1);
        assertThat(MarsRover.getDirection()).isEqualTo('W');
    }

    @Test
    void shouldMoveToOpposite_whenGoingAcrossThePoleFromLongitudeHigherThanFive()    {
        final var MarsRover = new MarsRover(5, 1, 'N');
        MarsRover.move(new char[]{'f'});
        assertThat(MarsRover.getX()).isEqualTo(1);
        assertThat(MarsRover.getY()).isEqualTo(1);
        assertThat(MarsRover.getDirection()).isEqualTo('W');
    }

}