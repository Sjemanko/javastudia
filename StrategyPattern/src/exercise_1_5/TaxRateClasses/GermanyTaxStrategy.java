package exercise_1_5.TaxRateClasses;

import exercise_1_5.TaxRateInterface.TaxRate;

public class GermanyTaxStrategy implements TaxRate {

    @Override
    public void countTax() {
        System.out.println("Germany tax rate: 19%");
    }

}
