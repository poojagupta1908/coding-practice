package org.java.interviewprograms;

public class CountVowelsConsonants {


    public static void main(String[] args) {
        String inputString = "Java Programming";
        inputString = inputString.toLowerCase();
        System.out.println("Original String are :" + inputString);

        int vowels = 0, consonants = 0;
        for (int i = 0; i < inputString.length(); i++) {

            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                //check for vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

            System.out.println("vowels" + vowels);
            System.out.println("consonants" + consonants);



    }
}
