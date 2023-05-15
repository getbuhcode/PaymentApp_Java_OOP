public class KFCPayment extends GeneralPayment {

    private double amount;

    public void payCash(double cashAmount) {
        setAmount(cashAmount);
        System.out.println("Please proceed to cashier counter for payment. Thank you!");
    }

    public void payCreditCard(double creditCardAmount) {
        setAmount(creditCardAmount);
        System.out.println("Credit Card Payment of $" + String.format("%.2f",amount) + " completed. Thank you!");
    }

    // Additional payment method added
    public void payNets(double netsAmount) {
        setAmount(netsAmount);
        System.out.println("Nets Payment: $" + String.format("%.2f",amount) + " completed. Thank you!");
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
