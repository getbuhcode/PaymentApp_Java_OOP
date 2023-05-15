public class ValueMeal {

    private String mainDish;
    private String sideDish;
    private String drinks;
    private String nameOfValueMeal;
    private float valueMealPrice;

    //empty constructor
    public ValueMeal() {

    }

    public ValueMeal(String mainDish,
                     String sideDish,
                     String drinks,
                     String nameOfValueMeal,
                     float valueMealPrice) {

        setMainDish(mainDish);
        setSideDish(sideDish);
        setDrinks(drinks);
        setNameOfValueMeal(nameOfValueMeal);
        setValueMealPrice(valueMealPrice);
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getNameOfValueMeal() {
        return nameOfValueMeal;
    }

    public void setNameOfValueMeal(String nameOfValueMeal) {
        this.nameOfValueMeal = nameOfValueMeal;
    }

    public float getValueMealPrice() {
        return valueMealPrice;
    }

    public void setValueMealPrice(float valueMealPrice) {
        this.valueMealPrice = valueMealPrice;
    }
}
