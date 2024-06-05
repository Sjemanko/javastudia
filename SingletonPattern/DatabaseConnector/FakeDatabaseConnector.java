package SingletonPattern.DatabaseConnector;


public class FakeDatabaseConnector {

    private static FakeDatabaseConnector FDCinstanse;
    public static int counter = 0;

    FakeDatabaseConnector() {counter+=1;}

    public static FakeDatabaseConnector getInstance() {
        if (FDCinstanse == null) {
            FDCinstanse = new FakeDatabaseConnector();
        }
        return FDCinstanse;
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
