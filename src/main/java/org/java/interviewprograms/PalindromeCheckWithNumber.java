package org.java.interviewprograms;

public class PalindromeCheckWithNumber {

    public static void main(String[] args) {
        int input = 123215;
        if(isNumberPalindrome(input)){
            System.out.println("Input Number is Palindrome");
        }else{
            System.out.println("NOT Palindrome");
        }
    }

    private static boolean isNumberPalindrome(int input) {
           int temp = input;
           int reverse=0;
           while(input !=0){
               int digit = input % 10;
               reverse = reverse*10 + digit;
               input/=10;
           }
        return temp == reverse;
    }


    /*
    Example: num = 121
Initialization
original = 121
reversed = 0
First loop
digit = 121 % 10 = 1
reversed = 0 * 10 + 1 = 1
num = 121 / 10 = 12
Second loop
digit = 12 % 10 = 2
reversed = 1 * 10 + 2 = 12
num = 12 / 10 = 1
Third loop
digit = 1 % 10 = 1
reversed = 12 * 10 + 1 = 121
num = 1 / 10 = 0 (loop ends)
Compare
original = 121
reversed = 121

*/

}