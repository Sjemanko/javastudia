package exercise_1_6.Classes;

import exercise_1_6.Interfaces.Pracowac;

public class Leczenie implements Pracowac{
    @Override
    public void pracuj(){
        System.out.println("Leczenie");
    }
}
