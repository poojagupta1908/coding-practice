package org.java.interviewprograms;

public class PalindromeCheckWithString {

    public static void main(String[] args) {
        String input = "madame";
        if(checkPalindrome(input)){
            System.out.println("Input String is Palindrome");
        }else{
            System.out.println("NOT Palindrome");
        }
    }

    private static boolean checkPalindrome(String input) {

        if(input==null){
            return false;
        }

        int left=0;
        int right = input.length()-1;

       while(left<right){
           if(input.charAt(left) != input.charAt(right)){
              return false;
           }
           left++;
           right--;
       }

        return true;
    }


}
