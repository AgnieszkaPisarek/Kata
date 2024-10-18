import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsTest {

    @Test
    public void shouldReturnEmptyList_whenGivenOne() {
        final var primeFactors = new PrimeFactors();
        int number = 1;
        List<Integer> listOfPrimeFactors = primeFactors.primeFactors(number);
        assertThat(listOfPrimeFactors).isEmpty();
    }

    @Test
    public void shouldReturnTwo_whenGivenOne() {
        final var primeFactors = new PrimeFactors();
        int number = 2;
        List<Integer> listOfPrimeFactors = primeFactors.primeFactors(number);
        assertThat(listOfPrimeFactors.getFirst()).isEqualTo(2);
    }

    @Test
    public void shouldReturnThree_whenGivenThree() {
        final var primeFactors = new PrimeFactors();
        int number = 3;
        List<Integer> listOfPrimeFactors = primeFactors.primeFactors(number);
        assertThat(listOfPrimeFactors.getFirst()).isEqualTo(3);
    }

    @Test
    public void shouldReturnTwoTwo_whenGivenFour() {
        final var primeFactors = new PrimeFactors();
        int number = 4;
        List<Integer> listOfPrimeFactors = primeFactors.primeFactors(number);
        assertThat(listOfPrimeFactors.getFirst()).isEqualTo(2);
        assertThat(listOfPrimeFactors.get(1)).isEqualTo(2);
    }

    @Test
    public void shouldReturnTwoThree_whenGivenSix() {
        final var primeFactors = new PrimeFactors();
        int number = 6;
        List<Integer> listOfPrimeFactors = primeFactors.primeFactors(number);
        assertThat(listOfPrimeFactors.getFirst()).isEqualTo(2);
        assertThat(listOfPrimeFactors.get(1)).isEqualTo(3);
    }

    @Test
    public void shouldReturnTwoTwoTwo_whenGivenEight() {
        final var primeFactors = new PrimeFactors();
        int number = 8;
        List<Integer> listOfPrimeFactors = primeFactors.primeFactors(number);
        assertThat(listOfPrimeFactors.getFirst()).isEqualTo(2);
        assertThat(listOfPrimeFactors.get(1)).isEqualTo(2);
        assertThat(listOfPrimeFactors.get(2)).isEqualTo(2);
    }

    @Test
    public void shouldReturnThreeThree_whenGivenNine() {
        final var primeFactors = new PrimeFactors();
        int number = 9;
        List<Integer> listOfPrimeFactors = primeFactors.primeFactors(number);
        assertThat(listOfPrimeFactors.getFirst()).isEqualTo(3);
        assertThat(listOfPrimeFactors.get(1)).isEqualTo(3);
    }

    @Test
    public void shouldReturnTwoThreeThree_whenGivenEighteen() {
        final var primeFactors = new PrimeFactors();
        int number = 18;
        List<Integer> listOfPrimeFactors = primeFactors.primeFactors(number);
        assertThat(listOfPrimeFactors.getFirst()).isEqualTo(2);
        assertThat(listOfPrimeFactors.get(1)).isEqualTo(3);
        assertThat(listOfPrimeFactors.get(2)).isEqualTo(3);
    }

    @Test
    public void shouldReturnFiveFive_whenGivenTwentyFive() {
        final var primeFactors = new PrimeFactors();
        int number = 25;
        List<Integer> listOfPrimeFactors = primeFactors.primeFactors(number);
        assertThat(listOfPrimeFactors.getFirst()).isEqualTo(5);
        assertThat(listOfPrimeFactors.get(1)).isEqualTo(5);
    }

    @Test
    public void shouldReturnSixTwos_whenGivenSixtyFour() {
        final var primeFactors = new PrimeFactors();
        int number = 64;
        List<Integer> listOfPrimeFactors = primeFactors.primeFactors(number);
        assertThat(listOfPrimeFactors.getFirst()).isEqualTo(2);
        assertThat(listOfPrimeFactors.get(1)).isEqualTo(2);
        assertThat(listOfPrimeFactors.get(2)).isEqualTo(2);
        assertThat(listOfPrimeFactors.get(3)).isEqualTo(2);
        assertThat(listOfPrimeFactors.get(4)).isEqualTo(2);
        assertThat(listOfPrimeFactors.get(5)).isEqualTo(2);
    }

    @Test
    public void shouldReturnTwoThirtySeven_whenGivenSeventyFour() {
        final var primeFactors = new PrimeFactors();
        int number = 74;
        List<Integer> listOfPrimeFactors = primeFactors.primeFactors(number);
        assertThat(listOfPrimeFactors.getFirst()).isEqualTo(2);
        assertThat(listOfPrimeFactors.get(1)).isEqualTo(37);
    }
}