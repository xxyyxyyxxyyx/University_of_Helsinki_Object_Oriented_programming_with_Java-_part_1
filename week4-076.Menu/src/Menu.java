
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    //method for adding new meal to the menu list
    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);

        }
    }

    public void printMeals() {
        for (String items : meals) {
            System.out.println(items);
        }
    }
    
    public void clearMenu(){
        meals.clear();
    }

}
