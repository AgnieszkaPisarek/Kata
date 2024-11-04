import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List<Integer> primeFactors(int n) {

        List<Integer> primes = new ArrayList<>();
        if(n == 1)
            return primes;

        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                primes.add(i);
                n /= i;
            }
        }
        primes.add(n);
        return primes;
    }
}
