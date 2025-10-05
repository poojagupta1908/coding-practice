package org.java.interviewprograms;

public class FactorialRecursive {

    //✅ Elegant, shows recursion clearly
    //⚠️ Risk of StackOverflowError for large n

    public static void main(String[] args) {
        int n = 5;
        long result = factorial(n);
        System.out.println("Factorial of" + " " +n  + " " +  "is"  + " " + result );
    }

    private static long factorial(int n) {
        if(n==0|n==1){
            return 1;//Base Case
        }else{
            return n*factorial(n-1);
        }
    }
}
