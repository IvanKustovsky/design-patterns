// Singleton Database Connection Manager
public class DatabaseConnectionManager {

    // Step 1: Private static instance of the same class
    private static volatile DatabaseConnectionManager instance;

    // Step 2: Private constructor to prevent instantiation
    private DatabaseConnectionManager() {
        // Simulate expensive setup like connecting to a DB
        System.out.println("Initializing database connection...");
    }

    // Step 3: Public method to provide access to the instance (thread-safe with double-checked locking)
    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectionManager.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionManager();
                }
            }
        }
        return instance;
    }

    // Example method to simulate a query
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }

    // Example method to close connection (for illustration)
    public void close() {
        System.out.println("Closing database connection...");
    }
}

// Client code to test Singleton behavior
public class Main {
    public static void main(String[] args) {
        DatabaseConnectionManager connection1 = DatabaseConnectionManager.getInstance();
        connection1.query("SELECT * FROM users");

        DatabaseConnectionManager connection2 = DatabaseConnectionManager.getInstance();
        connection2.query("SELECT * FROM orders");

        // Verify both connections are the same instance
        System.out.println(connection1 == connection2); // true
    }
}
