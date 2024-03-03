package exercise_5.ShopModels;

import exercise_5.TaxRateInterface.TaxRate;

public abstract class Shop {
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
