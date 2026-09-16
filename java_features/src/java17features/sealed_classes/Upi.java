package java17features.sealed_classes;

public non-sealed class Upi extends Payment{

    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}
