package bai_2;

import java.util.Scanner;

public class MaxNumberWithMultipleInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstNumber, secondNumber, thirdNumber, max;
        System.out.println("Enter first number: ");
        firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = sc.nextInt();
        System.out.println("Enter third number: ");
        thirdNumber = sc.nextInt();
        max = firstNumber;
        if(secondNumber > max){
            max = secondNumber;
        }
        if (thirdNumber > max){
            max = thirdNumber;
        }
        System.out.printf("Max is: %d", max);
    }
}