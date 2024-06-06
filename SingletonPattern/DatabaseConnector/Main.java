public class Main {

    public static void main(String[] args)
    {
        FakeDatabaseConnector DBCexample = FakeDatabaseConnector.getInstance();
        DBCexample.connect();
        DBCexample.executeQuery("SQL QUERY(1)");
        System.out.println(FakeDatabaseConnector.counter);

        FakeDatabaseConnector DBCexample2 = FakeDatabaseConnector.getInstance();
        DBCexample2.connect();
        DBCexample2.executeQuery("SQL QUERY(2)");
        System.out.println(FakeDatabaseConnector.counter);
    }
}
