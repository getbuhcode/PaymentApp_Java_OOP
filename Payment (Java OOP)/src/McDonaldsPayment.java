import java.util.Currency;

public class McDonaldsPayment extends GeneralPayment {

    private float amount;

    public void payCash(float cashAmount) {
        setAmount(cashAmount);
        System.out.println("Please proceed to cashier counter for payment. Thank you!");
    }

    public void payCreditCard(float creditCardAmount) {
        setAmount(creditCardAmount);
        System.out.println("Credit Card Payment of $" + String.format("%.2f",amount) + " completed. Thank you!");
    }

    // Additional payment method added
    public void payGrabpay(float grabpayAmount) {
        setAmount(grabpayAmount);
        System.out.println("Grabpay Payment: $" + String.format("%.2f",amount) + " completed. Thank you!");
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
