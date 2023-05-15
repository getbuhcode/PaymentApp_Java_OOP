import java.util.ArrayList;
import java.util.Scanner;

public class McDonaldsPaymentKiosk extends McDonaldsPayment {

    private static float totalPayableAmount;
    private static ArrayList<ValueMeal> orderList = new ArrayList<>();

    public static void main(String[] args) {

        // Instantiate a Scanner for user input
        Scanner scan = new Scanner(System.in);

        // Get user order
        while (true) {

            System.out.println("Please input the number of the meal you would like:");
            System.out.println("1 : McSpicy Value Meal");
            System.out.println("2 : Filet-O-Fish Value Meal");
            System.out.println("3 : McWings (4pcs) Value Meal");

            int mealSelection = scan.nextInt();

            // Switch case for different value meals
            switch (mealSelection) {

                case 1:
                    ValueMeal mcSpicyMeal = new ValueMeal(
                            "McSpicy Burger",
                            "Fries",
                            "Coke",
                            "McSpicyValueMeal",
                            7.95F);
                    orderList.add(mcSpicyMeal);
                    break;

                case 2:
                    ValueMeal filet_O_FishMeal = new ValueMeal(
                            "Filet-O-Fish Burger",
                            "Fries",
                            "Coke",
                            "Filet-O-FishValueMeal",
                            6.20F);
                    orderList.add(filet_O_FishMeal);
                    break;

                case 3:
                    ValueMeal mcWings_4pcsMeal = new ValueMeal(
                            "mcWings_4pcs",
                            "Fries",
                            "Coke",
                            "McWings_4pcsValueMeal",
                            7.25F);
                    orderList.add(mcWings_4pcsMeal);
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
        System.out.println("3 : Grabpay");

        int paymentSelection = scan.nextInt();

        // Instantiate a McDonaldsPaymentKiosk object for payment
        McDonaldsPaymentKiosk kiosk = new McDonaldsPaymentKiosk();

        // cash payment
        if (paymentSelection == 1) {

            kiosk.payCash(totalPayableAmount);

        // credit card payment
        } else if (paymentSelection == 2) {

            kiosk.payCreditCard(totalPayableAmount);

        // grabpay payment
        } else if (paymentSelection == 3) {

            kiosk.payGrabpay(totalPayableAmount);

        }

    }

}
