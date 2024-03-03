package TaxRateClasses;

import TaxRateInterface.TaxRate;

public class GermanyTaxStrategy implements TaxRate {

    @Override
    public void countTax() {
        System.out.println("Germany tax rate: 19%");
    }

}
