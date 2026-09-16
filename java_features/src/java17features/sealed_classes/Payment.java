package java17features.sealed_classes;

public sealed class Payment permits CreditCard, Upi{
    public void pay(){
        System.out.println("Payment done");
    }
}
