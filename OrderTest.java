public class OrderTest {
    public static void main(String[] args) {
        Order orderPlacement = new OrderPlacement();
        CostCalculator costCalculator = new CalculateCost();
        InvoiceGenerator invoiceGenerator = new Generate();
        EmailNotifier emailNotifier = new EmailNotification();

        OrderAction orderAction = new OrderAction(orderPlacement, costCalculator, invoiceGenerator, emailNotifier);

        double total = orderAction.calculateTotal(10.0, 2);
        System.out.println("\nOrder total: $" + total);

        orderAction.placeOrder("John Doe", "123 Main Street");
        orderAction.generateInvoice("order_123.pdf");
        orderAction.sendEmailNotification("johndoe@example.com");
    }
}
