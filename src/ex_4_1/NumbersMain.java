package ex_4_1;

import java.util.ArrayList;

public class NumbersMain {
    public static void main(String[] args) {
        InputData inputData = new InputData();
        PositiveNumbersFilter pnf = new PositiveNumbersFilter(inputData);

        inputData.setCurrentValue(1);
        inputData.setCurrentValue(2);
        inputData.setCurrentValue(-1);
        inputData.setCurrentValue(3);

    }
}
