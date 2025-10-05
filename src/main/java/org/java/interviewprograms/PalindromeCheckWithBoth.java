package org.java.interviewprograms;

public class PalindromeCheckWithBoth {

    public static void main(String[] args) {
        // Test with String
        String text = "madam";
        System.out.println(text + " → " + (checkPalindrome(text) ? "Palindrome" : "Not Palindrome"));

        // Test with Number
        int number = 12321;
        System.out.println(number + " → " + (checkPalindrome(number) ? "Palindrome" : "Not Palindrome"));

        // Another test
        int notPalindrome = 12345;
        System.out.println(notPalindrome + " → " + (checkPalindrome(notPalindrome) ? "Palindrome" : "Not Palindrome"));
    }

    private static boolean checkPalindrome(Object input) {

        String str = String.valueOf(input);

        int left=0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }



}
