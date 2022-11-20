package Mnozenie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculations table = new Calculations();
        int varA, varB, result;
        System.out.print("Enter size of array (X>0):");
        int size = scanner.nextInt();
        System.out.print("Enter the bulb number (1-"+(size*2)+"):");
        int bulb = scanner.nextInt();
        for (int i = 0; i < Math.pow(2,size); i++) {
            for (int j = 0; j < Math.pow(2,size); j++) {
                varA = table.changeNumber(i,size);
                varB = table.changeNumber(j,size);
                result = table.solutionOfTwoNumbers(varA, varB, bulb);
                print(result);
            }
            System.out.println();
        }
    }

    private static void print(int result) {
        if(result == 1) {
            System.out.print("X");
        }
        else {
            System.out.print("-");
        }
        System.out.print(" ");
    }
}