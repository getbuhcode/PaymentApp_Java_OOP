import java.util.ArrayList;
import java.util.Scanner;

public class KFCPaymentKiosk extends KFCPayment {

    private static float totalPayableAmount;
    private static ArrayList<ValueMeal> orderList = new ArrayList<>();

    public static void main(String[] args) {

        // Instantiate a Scanner for user input
        Scanner scan = new Scanner(System.in);

        // Get user order
        while (true) {

            System.out.println("Please input the number of the meal you would like:");
            System.out.println("1 : 2pcs Meal");
            System.out.println("2 : 3pcs Meal");
            System.out.println("3 : Shrooms Burger Meal");

            int mealSelection = scan.nextInt();

            // Switch case for different value meals
            switch (mealSelection) {

                case 1:
                    ValueMeal _2pcsChickenMeal = new ValueMeal(
                            "2pcs Chicken",
                            "Fries",
                            "Coke",
                            "2pcsChickenMeal",
                            11.30F);
                    orderList.add(_2pcsChickenMeal);
                    break;

                case 2:
                    ValueMeal _3pcsChickenMeal = new ValueMeal(
                            "3pcs Chicken",
                            "Fries",
                            "Coke",
                            "3pcsChickenMeal",
                            13.70F);
                    orderList.add(_3pcsChickenMeal);
                    break;

                case 3:
                    ValueMeal shroomsBurgerMeal = new ValueMeal(
                            "Shrooms Burger",
                            "Fries",
                            "Coke",
                            "ShroomsBurgerMeal",
                            6.90F);
                    orderList.add(shroomsBurgerMeal);
                    break;
            }

            // Ask if user wants to continue ordering
            System.out.println("Would you like to continue ordering? (y/n)");
            scan.nextLine();
            String continueOrder = scan.nextLine();

            if (continueOrder.toLowerCase().equals("n")) {
                break;
            }

        }

        // Preview of order receipt to user
        System.out.println();
        System.out.println("Your order is as follows: ");
        System.out.println();

        for (ValueMeal valueMeal : orderList) {

            System.out.println(valueMeal.getNameOfValueMeal() + "  $" + String.format("%.2f",valueMeal.getValueMealPrice()));
            totalPayableAmount += valueMeal.getValueMealPrice();

        }

        System.out.println("Total Amount: $" + String.format("%.2f",totalPayableAmount));
        System.out.println();

        // Ask user for payment method
        System.out.println("Please select the payment method you would like:");
        System.out.println("1 : Cash");
        System.out.println("2 : Credit Card (Visa/Master)");
        System.out.println("3 : Nets");

        int paymentSelection = scan.nextInt();

        // Instantiate a KFCPaymentKiosk object for payment
        KFCPaymentKiosk kiosk = new KFCPaymentKiosk();

        // cash payment
        if (paymentSelection == 1) {

            kiosk.payCash(totalPayableAmount);

        // credit card payment
        } else if (paymentSelection == 2) {

            kiosk.payCreditCard(totalPayableAmount);

        // nets payment
        } else if (paymentSelection == 3) {

            kiosk.payNets(totalPayableAmount);

        }

    }
}
