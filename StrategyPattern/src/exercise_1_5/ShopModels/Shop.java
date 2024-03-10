package exercise_1_5.ShopModels;

import exercise_1_5.TaxRateInterface.TaxRate;

public class Shop {
    TaxRate tax;

    public Shop(TaxRate tax){
        this.tax = tax;
    }

    public TaxRate getTax() {
        return tax;
    }

    public void setTax(TaxRate tax) {
        this.tax = tax;
    }

    public void showTaxTreshold(){
        tax.countTax();
    }
}
