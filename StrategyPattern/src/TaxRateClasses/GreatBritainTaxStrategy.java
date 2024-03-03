package TaxRateClasses;

import TaxRateInterface.TaxRate;

public class GreatBritainTaxStrategy implements TaxRate {

    @Override
    public void countTax() {
        System.out.println("Great Britain tax: 20%");
    }

}
