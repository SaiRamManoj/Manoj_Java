package ThreadsImplementation;

public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {}

    // Public static method to get the single instance of the class
    public static synchronized Singleton getInstance() {
        // Synchronize the creation of the instance to make it thread-safe
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods of the class can go here
}

