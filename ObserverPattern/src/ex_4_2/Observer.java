package ex_4_2;

import java.util.Map;

public interface Observer {
    public void update(Map<String, Double> updatedPricings);
}
