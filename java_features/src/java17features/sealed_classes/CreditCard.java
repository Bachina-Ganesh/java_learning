package java17features.sealed_classes;

public final class CreditCard extends Payment{

    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}
