package org.example;

public class FizzBuzz {
    public String compute(int number) {

        var result = new StringBuilder();
        String textNumber = String.valueOf(number);

        if(number % 3 == 0)    {
            result.append("Fizz");
        }

        if(textNumber.contains("3"))    {
            result.append("Fizz");
        }

        if(textNumber.contains("5"))    {
            result.append("Buzz");
        }

        if(number % 5 == 0)    {
            result.append("Buzz");
        }

        return result.toString();
    }

    public void print() {
        for(int i = 1; i <= 100; i++)  {
            System.out.println(compute(i));
        }
    }
}