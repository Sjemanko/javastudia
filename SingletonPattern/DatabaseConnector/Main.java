package SingletonPattern.DatabaseConnector;

public class Main {

    public static void main(String[] args)
    {
        DatabaseConnectorExample DBCexample = DatabaseConnectorExample.getInstance();
        DBCexample.connect();
        DBCexample.executeQuery("SQL QUERY(1)");
        System.out.println(DatabaseConnectorExample.counter);

        DatabaseConnectorExample DBCexample2 = DatabaseConnectorExample.getInstance();
        DBCexample2.connect();
        DBCexample2.executeQuery("SQL QUERY(2)");
        System.out.println(DatabaseConnectorExample.counter);
    }
}
