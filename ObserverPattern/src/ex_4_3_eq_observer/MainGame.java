package ex_4_3_eq_observer;

public class MainGame {
    public static void main(String[] args) {
        Equipment eq = new Equipment();
        AddedItemsObserver aio = new AddedItemsObserver(eq);
        QuestItemObserver qio1 = new QuestItemObserver(eq);
        QuestItemObserver qio2 = new QuestItemObserver(eq);
        QuestItemObserver qio3 = new QuestItemObserver(eq);

        qio1.setQuestItemAndAmount("kwiatek", 5);
        qio2.setQuestItemAndAmount("kawa", 2);
        qio3.setQuestItemAndAmount("papierosy", 4);

        eq.addItemToList("kwiatek", 2);
        eq.addItemToList("kwiatek", 2);
        eq.removeItemFromList("kwiatek", 2);
        eq.addItemToList("mango", 3);
        eq.addItemToList("papierosy", 2);
        eq.addItemToList("kwiatek", 3);
        eq.addItemToList("kawa", 4);
        eq.addItemToList("papierosy",  2);
    }
}
