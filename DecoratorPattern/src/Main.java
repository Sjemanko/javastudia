import ex_3_3.BaseClasses.Meal;
import ex_3_3.ReadyToGoObjects.ChicagoPizza;
import ex_3_3.ReadyToGoObjects.NewYorkPizza;
import ex_3_3.Topings.ExtraCheese;
import ex_3_3.Topings.ExtraSauces;
import ex_3_3.Topings.RemoveTopping;

public class Main {
    public static void main(String[] args) {
        Meal firstPizza = new ChicagoPizza();
        System.out.println(firstPizza.getDescription()); 
        System.out.printf("%1.2f\n", firstPizza.cost());

        firstPizza = new RemoveTopping(firstPizza, "Cheese");        
        System.out.println(firstPizza.getDescription()); 
        System.out.printf("%1.2f\n", firstPizza.cost());

        firstPizza = new ExtraSauces(firstPizza);
        System.out.println(firstPizza.getDescription()); 
        System.out.printf("%1.2f\n", firstPizza.cost());

        firstPizza = new ExtraCheese(firstPizza);
        System.out.println(firstPizza.getDescription()); 
        System.out.printf("%1.2f\n", firstPizza.cost());

        System.out.println();
        System.out.println();

        Meal secondPizza = new NewYorkPizza();
        System.out.println(secondPizza.getDescription()); 
        System.out.printf("%1.2f\n", secondPizza.cost());

        secondPizza = new ExtraSauces(secondPizza);
        System.out.println(secondPizza.getDescription()); 
        System.out.printf("%1.2f\n", secondPizza.cost());
        
        secondPizza = new RemoveTopping(secondPizza, "Mozzarella");
        System.out.println(secondPizza.getDescription()); 
        System.out.printf("%1.2f\n", secondPizza.cost());
    }
}
