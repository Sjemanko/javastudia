package exercise_6.Classes;

import exercise_6.Interfaces.Pracowac;

public class NaprawaSamochodow implements Pracowac {

    @Override
    public void pracuj() {
        System.out.println("Naprawianie samochodów");
    }

}
