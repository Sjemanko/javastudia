package ShopModels;

import TaxRateInterface.TaxRate;

public abstract class Shop {
    TaxRate tax;
    String country;

    public Shop(TaxRate tax){
        this.tax = tax;
    }

    public TaxRate getTax() {
        return tax;
    }

    public String getCountry() {
        return country;
    }

    public void setTax(TaxRate tax) {
        this.tax = tax;
    }

    public void showTaxTreshold(){
        tax.countTax();
    }
}
