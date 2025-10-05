package org.java.interviewprograms;

public class PrimeNumbersUptoN {

    // Function to check if a number is prime
    static boolean checkPrime(int num) {
        if (num <= 1)
            return false; // numbers <= 1 are not prime

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false; // divisible -> not prime
        }
        return true; // no divisors -> prime
    }

    public static void main(String[] args) {
        int n = 100; // print all prime numbers up to 100
        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 2; i <= n; i++) {
            if (checkPrime(i))
                System.out.print(i + " ");
        }
    }
}

