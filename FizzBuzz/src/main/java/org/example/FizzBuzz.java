package org.example;

public class FizzBuzz {
    public String compute(int number) {
        return String.valueOf(number);
    }

    public void print() {
        for(int i = 1; i <= 100; i++)  {
            System.out.println(compute(i));
        }
    }
}