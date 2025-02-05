// Abstract class PaymentMethod
abstract class PaymentMethod {
    // Abstract method to process payment
    abstract void processPayment(double amount);
}

// CreditCard class extending PaymentMethod
class CreditCard extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        double fee = amount * 0.02; // 2% transaction fee
        System.out.println("Processing Credit Card Payment: $" + (amount + fee) + " (including 2% fee)");
    }
}

// PayPal class extending PaymentMethod
class PayPal extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal Payment: $" + amount + " (No extra fee)");
    }
}

// Transaction Processing System
public class PaymentSystem {
    // Method to process transaction using a PaymentMethod object (Polymorphism)
    public static void processTransaction(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount); // Calls appropriate processPayment() based on runtime object
    }

    // Main method to test the payment system
    public static void main(String[] args) {
        // Creating PaymentMethod objects
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();

        // Processing transactions using different payment methods
        processTransaction(creditCard, 100.00);  // Uses CreditCard's processPayment
        processTransaction(payPal, 100.00);      // Uses PayPal's processPayment
    }
}