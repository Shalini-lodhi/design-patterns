// Context Class
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Set the strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Perform payment using the selected strategy
    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method first.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}