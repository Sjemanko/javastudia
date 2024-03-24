package exercise_3_4.BaseClasses;

import java.util.ArrayList;

public class ProductsList extends Product{

    ArrayList<Product> productList = new ArrayList<>();

    public ProductsList(ArrayList<Product> productList)
    {
        this.productList = productList;    
    }

    @Override
    public double cost() {
        double sum = 0;
        for(Product product: productList)
        {
            sum += product.cost();
        }
        return sum;
    }

    @Override
    public String getDescription()
    {
        StringBuilder sb = new StringBuilder();
        for(Product product : productList)
        {
            sb.append(product.getDescription()).append(", ");
        }
        return sb.toString();
    }    
}
