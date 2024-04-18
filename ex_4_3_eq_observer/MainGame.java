package ex_4_3_eq_observer;

public class MainGame {
    public static void main(String[] args) {
        Equipment eq = new Equipment();
        QuestItemObserver qio = new QuestItemObserver(eq);

        qio.setQuestItemAndAmount("kwiatek", 5);


        eq.addItemToList("kwiatek", 2);
        eq.addItemToList("kwiatek", 3);
        eq.addItemToList("mango", 3);
    }
}
