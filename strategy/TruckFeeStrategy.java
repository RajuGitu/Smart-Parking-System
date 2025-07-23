package strategy;

public class TruckFeeStrategy implements FeeStrategy {
    public double calculateFee(long hours) {
        return hours * 80;
    }
}
