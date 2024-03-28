import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.Decorators.ExtraCheese;
import exercise_3_3.Decorators.ExtraSauces;
import exercise_3_3.Objects.BasicPizza;
import exercise_3_3.Objects.ChicagoPizza;
// import exercise_3_4.BaseClasses.Product;
// import exercise_3_4.BaseClasses.ProductsList;
// import exercise_3_4.Decorators.Discount;
// import exercise_3_4.Decorators.Mascot;
// import exercise_3_4.Decorators.PendriveLanyard;
// import exercise_3_4.Decorators.TransportCost;
// import exercise_3_4.Objects.Table;
// import exercise_3_4.Objects.Clock;
import exercise_3_3.Objects.DetroitStylePizza;

public class DecoratorMain{
    public static void main(String[] args) {

        // ex. 3_3
        Meal firstPizza = new BasicPizza();
        firstPizza = new ChicagoPizza(firstPizza);
        
        System.out.println(firstPizza.getDescription());
        System.out.printf("%1.2f\n", firstPizza.cost());

        firstPizza = new ExtraSauces(firstPizza);
        System.out.println(firstPizza.getDescription());
        System.out.printf("%1.2f\n", firstPizza.cost());
        
        Meal secondPizza = new BasicPizza();
        secondPizza = new DetroitStylePizza(secondPizza);

        System.out.println(secondPizza.getDescription());
        System.out.printf("%1.2f\n", secondPizza.cost());


        secondPizza = new ExtraCheese(secondPizza);
        System.out.println(secondPizza.getDescription());
        System.out.printf("%1.2f\n", secondPizza.cost());       

        // // ex. 3_4
        // Product clock = new Clock();

        // clock = new Discount(clock);
        // clock = new Mascot(clock);
        // clock = new PendriveLanyard(clock);
        // clock = new TransportCost(clock);

        // System.out.println(clock.getDescription());
        // System.out.println(clock.cost());

        // Product products = new ProductsList(new ArrayList<Product>(){
        //     {
        //         add(new Clock());
        //         add(new Table());
        //     }
        // });

        // System.out.println(products.getDescription());
        // System.out.println(products.cost());

        // products = new Discount(products);
        // products = new Mascot(products);
        // products = new PendriveLanyard(products);
        // products = new TransportCost(products);

        // System.out.println(products.getDescription());
        // System.out.println(products.cost());
    }
}
