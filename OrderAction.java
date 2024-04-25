public class OrderAction {
    private Order orderPlacement;
    private CostCalculator costCalculator;
    private InvoiceGenerator invoiceGenerator;
    private EmailNotifier emailNotifier;

    public OrderAction (Order orderPlacement, CostCalculator costCalculator,
    InvoiceGenerator invoiceGenerator, EmailNotifier emailNotifier){
        this.orderPlacement = orderPlacement;
        this.costCalculator = costCalculator;
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotifier = emailNotifier;
    }

    public void placeOrder (String customerName, String address){
        orderPlacement.placeOrder(customerName, address);
    }

    public double calculateTotal (double price, int quantity){
        return costCalculator.calculateTotal(price, quantity);
    }

    public void generateInvoice (String fileName){
        invoiceGenerator.generateInvoice(fileName);
    }

    public void sendEmailNotification (String email){
        emailNotifier.sendEmailNotification(email);
    }
}
