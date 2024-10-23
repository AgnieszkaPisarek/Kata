import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverEdgesTest {

    @Test
    void shouldMoveFromOneToFive_whenGoingForwardFromOneFacingN() {
        final var marsRover = new MarsRover(1, 1, 'N');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(5);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveFromTwoToSix_whenGoingForwardFromTwoFacingN() {
        final var marsRover = new MarsRover(2, 1, 'N');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(6);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveFromFourToEight_whenGoingForwardFromFourFacingN() {
        final var marsRover = new MarsRover(4, 1, 'N');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(8);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveFromSixToTwo_whenGoingForwardFromSixFacingN() {
        final var marsRover = new MarsRover(6, 1, 'N');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(2);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveFromSevenToThree_whenGoingForwardFromSevenFacingN() {
        final var marsRover = new MarsRover(7, 1, 'N');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(3);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveFromEightToFour_whenGoingForwardFromEightFacingN() {
        final var marsRover = new MarsRover(8, 1, 'N');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(4);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveToOpposite_whenGoingAcrossThePole()    {
        final var MarsRover = new MarsRover(3, 1, 'N');
        MarsRover.move(new char[]{'f'});
        assertThat(MarsRover.getX()).isEqualTo(7);
        assertThat(MarsRover.getY()).isEqualTo(1);
        assertThat(MarsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveToOpposite_whenGoingAcrossThePoleFromLongitudeHigherThanHalf()    {
        final var MarsRover = new MarsRover(5, 1, 'N');
        MarsRover.move(new char[]{'f'});
        assertThat(MarsRover.getX()).isEqualTo(1);
        assertThat(MarsRover.getY()).isEqualTo(1);
        assertThat(MarsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveToOpposite_whenGoingAcrossThePoleBackwards()    {
        final var MarsRover = new MarsRover(5, 1, 'S');
        MarsRover.move(new char[]{'b'});
        assertThat(MarsRover.getX()).isEqualTo(1);
        assertThat(MarsRover.getY()).isEqualTo(1);
        assertThat(MarsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromOneToFive_whenGoingBackwardFromOneFacingS() {
        final var marsRover = new MarsRover(1, 1, 'S');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(5);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromTwoToSix_whenGoingBackwardFromTwoFacingS() {
        final var marsRover = new MarsRover(2, 1, 'S');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(6);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromThreeToSeven_whenGoingBackwardFromThreeFacingS() {
        final var marsRover = new MarsRover(3, 1, 'S');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(7);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromFourToEight_whenGoingBackwardFromFourFacingS() {
        final var marsRover = new MarsRover(4, 1, 'S');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(8);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromSixToTwo_whenGoingBackwardFromSixFacingS() {
        final var marsRover = new MarsRover(6, 1, 'S');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(2);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromSevenToThree_whenGoingBackwardFromSevenFacingS() {
        final var marsRover = new MarsRover(7, 1, 'S');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(3);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromEightToFour_whenGoingBackwardFromEightFacingS() {
        final var marsRover = new MarsRover(8, 1, 'S');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(4);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromOneToFive_whenGoingForwardFacingS() {
        final var marsRover = new MarsRover(1, 8, 'S');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(5);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromTwoToSix_whenGoingForwardFacingS() {
        final var marsRover = new MarsRover(2, 8, 'S');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(6);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromThreeToSeven_whenGoingForwardFacingS() {
        final var marsRover = new MarsRover(3, 8, 'S');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(7);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromFourToEight_whenGoingForwardFacingS() {
        final var marsRover = new MarsRover(4, 8, 'S');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(8);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromFiveToOne_whenGoingForwardFacingS() {
        final var marsRover = new MarsRover(5, 8, 'S');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(1);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromSixToTwo_whenGoingForwardFacingS() {
        final var marsRover = new MarsRover(6, 8, 'S');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(2);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromSevenToThree_whenGoingForwardFacingS() {
        final var marsRover = new MarsRover(7, 8, 'S');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(3);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromEightToFour_whenGoingForwardFacingS() {
        final var marsRover = new MarsRover(8, 8, 'S');
        marsRover.move(new char[]{'f'});
        assertThat(marsRover.getX()).isEqualTo(4);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveFromEightToFour_whenGoingBackwardFacingN() {
        final var marsRover = new MarsRover(8, 8, 'N');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(4);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }
    @Test
    void shouldMoveFromOneToFive_whenGoingBackwardFacingN() {
        final var marsRover = new MarsRover(1, 8, 'N');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(5);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveFromTwoToSix_whenGoingBackwardFacingN() {
        final var marsRover = new MarsRover(2, 8, 'N');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(6);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveFromThreeToSeven_whenGoingBackwardFacingN() {
        final var marsRover = new MarsRover(3, 8, 'N');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(7);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveFromFourToEight_whenGoingBackwardFacingN() {
        final var marsRover = new MarsRover(4, 8, 'N');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(8);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveFromFiveToOne_whenGoingBackwardFacingN() {
        final var marsRover = new MarsRover(5, 8, 'N');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(1);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveFromSixToTwo_whenGoingBackwardFacingN() {
        final var marsRover = new MarsRover(6, 8, 'N');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(2);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldMoveFromSevenToThree_whenGoingBackwardFacingN() {
        final var marsRover = new MarsRover(7, 8, 'N');
        marsRover.move(new char[]{'b'});
        assertThat(marsRover.getX()).isEqualTo(3);
        assertThat(marsRover.getY()).isEqualTo(8);
        assertThat(marsRover.getDirection()).isEqualTo('S');
    }

}