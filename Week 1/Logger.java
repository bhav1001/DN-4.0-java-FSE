public class Logger {

    private static Logger instance;

    private Logger() {
        System.out.println("Logger instance created");
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "Logger- " + Integer.toHexString(hashCode());
    }
}
