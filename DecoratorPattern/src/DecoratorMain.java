import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.Decorators.ExtraCheese;
import exercise_3_3.Decorators.ExtraSauces;
import exercise_3_3.Objects.BasicPizza;
import exercise_3_3.Objects.ChicagoPizza;
import exercise_3_4.BaseClasses.Product;
import exercise_3_4.Decorators.Discount;
import exercise_3_4.Decorators.Mascot;
import exercise_3_4.Decorators.PendriveLanyard;
import exercise_3_4.Decorators.TransportCost;
import exercise_3_4.Objects.Table;
import exercise_3_4.Objects.Tea;
import exercise_3_4.Objects.Clock;
import exercise_3_4.Objects.ShoppingCart;
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

        System.out.println();
        System.out.println();
        System.out.println();
        
        // ex. 3_4
        Product singleProductShoppingCart = new ShoppingCart();
        singleProductShoppingCart = new Clock(singleProductShoppingCart);

        System.out.println(singleProductShoppingCart.getDescription());
        System.out.println(singleProductShoppingCart.cost());
        
        singleProductShoppingCart = new Discount(singleProductShoppingCart);
        singleProductShoppingCart = new Mascot(singleProductShoppingCart);
        singleProductShoppingCart = new PendriveLanyard(singleProductShoppingCart);
        singleProductShoppingCart = new TransportCost(singleProductShoppingCart);

        System.out.println(singleProductShoppingCart.getDescription());
        System.out.println(singleProductShoppingCart.cost());
        
        Product shoppingCart1 = new ShoppingCart();
        
        shoppingCart1 = new Clock(new Table(shoppingCart1));
        System.out.println(shoppingCart1.getDescription());
        System.out.println(shoppingCart1.cost());

        Product shoppingCart2 = new ShoppingCart();
        shoppingCart2 = new Tea(shoppingCart2);

        System.out.println(shoppingCart2.getDescription());
        System.out.println(shoppingCart2.cost());
        
        shoppingCart2 = new Discount(shoppingCart2);
           
        System.out.println(shoppingCart2.getDescription());
        System.out.println(shoppingCart2.cost());
    }
}
