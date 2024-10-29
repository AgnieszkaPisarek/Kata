package org.example;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = "FizzBuzz";

    public String compute(int number) {
        if(isDividableByThree(number) && isDividableByFive(number)) {
            return FIZZBUZZ;
        }
        if(isDividableByThree(number)) {
            return FIZZ;
        }
        if(isDividableByFive(number)) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private static boolean isDividableByFive(int number) {
        return number % 5 == 0;
    }

    private static boolean isDividableByThree(int number) {
        return number % 3 == 0;
    }

    public void print() {
        for(int i = 1; i <= 100; i++)  {
            System.out.println(compute(i));
        }
    }
}