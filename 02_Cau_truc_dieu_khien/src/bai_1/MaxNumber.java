package bai_1;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.println("Enter first number: ");
        firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = sc.nextInt();
        if(firstNumber > secondNumber){
            System.out.printf("Fist number(%d) > second number(%d)", firstNumber, secondNumber);
        }else{
            System.out.printf("Fist number(%d) < second number(%d)", firstNumber, secondNumber);
        }
    }
}