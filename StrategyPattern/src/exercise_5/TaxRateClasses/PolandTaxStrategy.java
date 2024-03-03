package exercise_5.TaxRateClasses;

import exercise_5.TaxRateInterface.TaxRate;

public class PolandTaxStrategy implements TaxRate {
    
    @Override
    public void countTax() {
        System.out.println("Poland tax rate: 23%");
    }

}
