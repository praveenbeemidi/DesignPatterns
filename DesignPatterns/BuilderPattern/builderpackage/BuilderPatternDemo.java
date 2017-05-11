package builderpackage;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder=new MealBuilder();
		
		Meal vegMeal=mealBuilder.prepareVegMeal();
		System.out.println("veg meal");
		vegMeal.showItems();
		System.out.println("Total Cost:" + vegMeal.getCost() );
		
		Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
		System.out.println("non-veg meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost:" + nonVegMeal.getCost() );
		
	}

}
