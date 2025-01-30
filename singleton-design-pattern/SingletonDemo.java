// Main class to test Singleton
public class SingletonDemo {

    public static void main(String[] args) {
        // Get the single instance of Singleton
        SingletonC singleton = SingletonC.getInstance();

        // Call a method on the Singleton instance
        singleton.showMessage();
    }
}