// Target Interface
interface PaymentProcessor {
    void processPayment(double amount);
}

// Adaptee (Third-party library with a different interface)
class PayPal {
    public void makePayment(double amountInDollars) {
        System.out.println("Processing payment of $" + amountInDollars + " via PayPal.");
    }
}

// Adapter Class
class PayPalAdapter implements PaymentProcessor {
    private final PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.makePayment(amount);
    }
}

// Another Adaptee (Stripe)
class Stripe {
    public void pay(double amount) {
        System.out.println("Processing payment of $" + amount + " via Stripe.");
    }
}

// Adapter for Stripe
class StripeAdapter implements PaymentProcessor {
    private final Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.pay(amount);
    }
}

// Client Code
public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());

        paypalProcessor.processPayment(150.0);
        stripeProcessor.processPayment(200.0);
    }
}
