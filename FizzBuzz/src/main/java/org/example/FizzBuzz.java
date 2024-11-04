package org.example;

public class FizzBuzz {
    final static String FIZZ = "Fizz";
    final static String BUZZ = "Buzz";

    public String compute(int number) {

        String stringNumber = String.valueOf(number);
        var result = new StringBuilder();

        if(stringNumber.contains("3"))  {
            result.append(FIZZ);
        }
        if(isDividableByThree(number)) {
            result.append(FIZZ);
        }
        if(isDividableByFive(number)) {
            result.append(BUZZ);
        }
        if(stringNumber.contains("5")) {
            result.append(BUZZ);
        }

        return result.isEmpty()? stringNumber : result.toString();

    }

    private static boolean isDividableByThree(int number) {
        return number % 3 == 0;
    }

    private static boolean isDividableByFive(int number) {
        return number % 5 == 0;
    }

    public void print() {
        for(int i = 1; i <= 100; i++)  {
            System.out.println(compute(i));
        }
    }
}