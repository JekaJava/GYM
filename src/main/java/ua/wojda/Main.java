package ua.wojda;

/**
 * Created by wojda on 29.02.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Database database = Database.newDatabase();
        database.connectToDatabase();
        database.databaseIsClosed();
    }
}
