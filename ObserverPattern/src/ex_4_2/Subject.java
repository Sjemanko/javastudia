package ex_4_2;

public interface Subject {
   void registerObserver(Observer observer); 
   void removeObserver(Observer observer);
   void notifyObservers();
}
