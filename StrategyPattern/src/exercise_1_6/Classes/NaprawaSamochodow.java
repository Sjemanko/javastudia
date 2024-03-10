package exercise_1_6.Classes;

import exercise_1_6.Interfaces.Pracowac;

public class NaprawaSamochodow implements Pracowac {

    @Override
    public void pracuj() {
        System.out.println("Naprawianie samochodów");
    }

}
