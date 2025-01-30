// Singleton class
class SingletonC {

    // 1. Private static variable for the instance
    private static SingletonC instance;

    // 2. Private constructor to prevent instantiation from outside
    private SingletonC() {
        // Constructor code
    }

    // 3. Public static method to provide access to the instance
    public static SingletonC getInstance() {
        // Lazy initialization - creates instance only when required
        if (instance == null) {
            instance = new SingletonC();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}