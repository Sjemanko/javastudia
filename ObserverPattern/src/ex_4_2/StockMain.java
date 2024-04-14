package ex_4_2;

import java.util.HashMap;

public class StockMain {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket(); 
        FirstCompany fc = new FirstCompany(stockMarket);
        SecondCompany sc = new SecondCompany(stockMarket);

        System.out.println();

        fc.display();
        sc.display();

        System.out.println();
        // 1  update
        stockMarket.setCompanyPricings(new HashMap<String,Double>() {
            {
                put("FirstCompany", 5.42);
                put("SecondCompany", 9.52);
            }
        });
        System.out.println();

        // 2 update
        stockMarket.setCompanyPricings(new HashMap<String,Double>() {
            {
                put("FirstCompany", 6.24);
                put("SecondCompany", 5.26);
            }
        });
        System.out.println();

        // 3 update - zmiana jednej wartości
        stockMarket.setCompanyPricings(new HashMap<String,Double>() {
            {
                put("FirstCompany", 6.27);
                put("SecondCompany", 5.26);
            }
        });
        System.out.println();
    }
}
