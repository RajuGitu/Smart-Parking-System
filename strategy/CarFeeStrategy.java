package strategy;

public class CarFeeStrategy implements FeeStrategy {
    public double calculateFee(long hours) {
        return hours * 50;
    }
}