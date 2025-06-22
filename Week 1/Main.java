public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Singleton Logger ---");

        Logger logger1 = Logger.getInstance();
        logger1.log("Message from logger1.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Message from logger2.");

        Logger logger3 = Logger.getInstance();
        logger3.log("Message from logger3.");


        System.out.println("\n--- Instance Verification ---");
        System.out.println("Logger 1 instance: " + logger1);
        System.out.println("Logger 2 instance: " + logger2);
        System.out.println("Logger 3 instance: " + logger3);

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("\nAll logger references point to the same instance.");
        } else {
            System.out.println("\nDifferent logger instances were created.");
        }
    }

}
