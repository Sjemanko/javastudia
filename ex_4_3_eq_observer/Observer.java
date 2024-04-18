package ex_4_3_eq_observer;

import java.util.ArrayList;
import java.util.HashMap;

public interface Observer {
    void update(HashMap<String, Integer> itemsList, String lastItemAddedToList);
}
