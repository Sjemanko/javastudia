package exercise_6.Classes;

import exercise_6.Interfaces.Pracowac;

public class RoznoszenieListow implements Pracowac {
    @Override
    public void pracuj(){
        System.out.println("Roznoszenie listów");
    }
}
