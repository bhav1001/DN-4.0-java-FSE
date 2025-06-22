public class FinancialForecaster {

    public static double calculateFutureValueRecursive(double presentValue, double growthRate, int periods) {

        if (periods < 0) {
            throw new IllegalArgumentException("Number of periods cannot be negative.");
        }

        if (periods == 0) {
            return presentValue;
        } else {
            double futureValuePreviousPeriod = calculateFutureValueRecursive(presentValue, growthRate, periods - 1);
            return futureValuePreviousPeriod * (1 + growthRate);
        }
    }
}