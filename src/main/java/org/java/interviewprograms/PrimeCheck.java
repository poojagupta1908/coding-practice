package org.java.interviewprograms;

public class PrimeCheck {

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
        int num = 29;

        if (checkPrime(num))
            System.out.println(num + " is a Prime number");
        else
            System.out.println(num + " is NOT a Prime number");
    }
}

