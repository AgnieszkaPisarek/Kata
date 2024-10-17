import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List<Integer> primeFactors(int n) {

        List<Integer> primes = new ArrayList<>();
        if(n > 1)
            primes.add(n);

        return primes;
    }
}
