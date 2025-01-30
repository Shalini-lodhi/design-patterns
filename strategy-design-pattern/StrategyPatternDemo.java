public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Selecting Credit Card payment strategy
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        // Changing strategy to PayPal
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(1000);

        // Changing strategy to UPI
        cart.setPaymentStrategy(new UpiPayment());
        cart.checkout(300);
    }
}