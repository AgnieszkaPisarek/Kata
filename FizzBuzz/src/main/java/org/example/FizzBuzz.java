package org.example;

public class FizzBuzz {
    public String compute(int number) {
        if(number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if(number % 3 == 0) {
            return "Fizz";
        }
        if(number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public void print() {
        for(int i = 1; i <= 100; i++)  {
            System.out.println(compute(i));
        }
    }
}