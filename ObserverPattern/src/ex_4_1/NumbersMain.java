package ex_4_1;

import java.util.Scanner;

public class NumbersMain {
    public static void main(String[] args) {
        InputData inputData = new InputData();
        Scanner sc = new Scanner(System.in);
        int inputVal = sc.nextInt();
        while (inputVal != 0) {
            System.out.println("Entered number: " + inputVal);
            inputVal = sc.nextInt();
        }

        System.out.println("Which numbers should I catch?");
        System.out.println("1 - Positive numbers");
        System.out.println("2 - Numbers equal 3");
        System.out.println("3 - Even numbers");
        
        switch (sc.nextInt()) {
            case 1:
                PositiveNumbersFilter pnf = new PositiveNumbersFilter(inputData);
                break;
            case 2:
                Equals3Filter e3f = new Equals3Filter(inputData);
                break;
            case 3:
                EvenNumbersFilter enf = new EvenNumbersFilter(inputData);
                break;
            default:
                System.out.println("Wrong option.");
                break;
        }

        int inputValFiltered = sc.nextInt();
        while (inputValFiltered != 0) {
            inputData.setCurrentValue(inputValFiltered);
            inputValFiltered = sc.nextInt();
        }
    }
}
