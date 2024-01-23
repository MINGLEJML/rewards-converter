public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertToCash(milesValue);
        }
    }

    // Get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Get how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }

    // Convert from miles to cash at a rate of 0.0035
    private double convertToCash(double miles) {
        return miles * 0.0035;
    }

    // Convert from cash to miles at a rate of 1 / 0.0035
    private double convertToMiles(double cash) {
        return cash / 0.0035;
    }
}
