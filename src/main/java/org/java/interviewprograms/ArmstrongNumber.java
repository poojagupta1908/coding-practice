package org.java.interviewprograms;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 123;
        int original = num;
        int sum = 0;

        while(num>0){
            int digit = num%10;
            sum += digit*digit*digit;
            num /=10;
        }

        if(sum==original){
            System.out.println(original + " is an Armstrong number");}
        else {
            System.out.println(original + " is NOT an Armstrong number");
        }

    }

}
