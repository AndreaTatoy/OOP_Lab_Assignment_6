public class CalculateCost implements CostCalculator {
    @Override
    public double calculateTotal (double price, int quantity){
        return price * quantity;
    }
}