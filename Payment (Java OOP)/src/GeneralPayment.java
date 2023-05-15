public class GeneralPayment implements Payment {

    /* Overloading Method with different signatures*/

    //Cash method
    @Override
    public void payCash() {

        System.out.println("this is a cash payment");
    }
    public void payCash(int int_amount) {

    }
    public void payCash(float float_amount) {

    }
    public void payCash(double double_amount) {

    }

    // Credit Card Method
    @Override
    public void payCreditCard() {

        System.out.println("this is a credit card payment");
    }
    public void payCreditCard(int int_amount) {

    }
    public void payCreditCard(float float_amount) {

    }
    public void payCreditCard(double double_amount) {

    }


}
