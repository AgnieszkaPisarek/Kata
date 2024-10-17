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

}