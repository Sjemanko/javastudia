package TaxRateClasses;

import TaxRateInterface.TaxRate;

public class PolandTaxStrategy implements TaxRate {
    
    @Override
    public void countTax() {
        System.out.println("Poland tax rate: 23%");
    }
    
}
