package org.java.interviewprograms;

public class FibonacciRecursive {

    public static void main(String[] args) {
        int n =10;
        System.out.println("Fibonacci Series are : ");
        for(int i =0;i<n;i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) {

        if(n==0){
         return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }


}
