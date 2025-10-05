package org.java.interviewprograms;

public class ReverseStringRecursive {

    public static void main(String[] args) {
        String initial1 = "Pizza";

        System.out.println("input string is "+ initial1);
        String result = reverseString(initial1);
        System.out.println("output string is "+ result);

    }

    private static String reverseString(String initial1) {

        if(initial1==null || initial1.length()<=1){
            return  initial1;
        }
        return reverseString(initial1.substring(1)) + initial1.charAt(0);

    }


    /*
reverse("O") = "O"
reverse("LO") = reverse("O") + 'L' = "O" + "L" = "OL"
reverse("LLO") = reverse("LO") + 'L' = "OL" + "L" = "OLL"
reverse("ELLO") = reverse("LLO") + 'E' = "OLL" + "E" = "OLLE"
reverse("HELLO") = reverse("ELLO") + 'H' = "OLLE" + "H" = "OLLEH"
*/


}
