package org.java.interviewprograms;

public class ReverseStringIterative  {


    public static void main(String[] args) {
        String initial1 = "Chocolate";

        System.out.println("input string is "+ initial1);
        String result = reverseString(initial1);
        System.out.println("output string is "+ result);

    }

    private static String reverseString(String initial1) {
        StringBuilder reverseString = new StringBuilder();
        for(int i = initial1.length() - 1;i>=0;i-- ){
            reverseString.append(initial1.charAt(i));
            //can use =>reverseString.reverse();
        }
        return reverseString.toString();
    }
}
