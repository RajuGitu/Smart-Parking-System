package strategy;

public class BikeFeeStrategy implements FeeStrategy {
    public double calculateFee(long hours) {
        return hours * 30;
    }
}
