import java.text.DecimalFormat;

public class Main4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        double pv = 1000.0; 
        double rate = 0.05; 
        int periods = 10;   

        System.out.println("--- Financial Forecasting Demonstration ---");
        System.out.println("Initial Investment (PV): " + df.format(pv));
        System.out.println("Annual Growth Rate (r): " + (rate * 100) + "%");
        System.out.println("Number of Periods (n): " + periods);


        System.out.println("\n--- Recursive Approach ---");
        try {
            double futureValueRecursive = FinancialForecaster.calculateFutureValueRecursive(pv, rate, periods);
            System.out.println("Future Value (Recursive): " + df.format(futureValueRecursive));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Testing with Invalid Input ---");
        try {
            FinancialForecaster.calculateFutureValueRecursive(pv, rate, -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}
