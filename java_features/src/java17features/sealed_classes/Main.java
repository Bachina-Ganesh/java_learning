package java17features.sealed_classes;

public class Main {
    static void main() {
        Payment creditCardPayment = new CreditCard();
        creditCardPayment.pay();

        Payment upiPayment = new Upi();
        upiPayment.pay();

    }
}
