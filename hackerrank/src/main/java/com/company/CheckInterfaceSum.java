package com.company;

public class CheckInterfaceSum implements ITestStep {

    int result = 12 > 10 ? 1 : 2;


    public static void main(String[] arg) {

        CheckInterfaceSum checkInterfaceSum = new CheckInterfaceSum();
        int sumMax = checkInterfaceSum.sum(5, 10);
        System.out.println("Sum is " + sumMax);
    }

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
