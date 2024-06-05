package SingletonPattern.DatabaseConnector;

public class DatabaseConnectorExample {

    private static DatabaseConnectorExample DBEinstance;
    public static int counter = 0;

    DatabaseConnectorExample() {counter+=1;}

    public static DatabaseConnectorExample getInstance() {
        if (DBEinstance == null) {
            DBEinstance = new DatabaseConnectorExample();
        }
        return DBEinstance;
    }

    public void connect() 
    {
        System.out.println("Connecting to DBinstance..");
    }

    public void executeQuery(String query) 
    {
        System.out.println("Executing query: " + query);
    }
}
