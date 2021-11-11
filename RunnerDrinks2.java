
public class RunnerDrinks {
	public static void main(String[] args) {

	Wiskey2 newObj = new Wiskey2();
	newObj.brand();
	newObj.percentage();
	newObj.price();
	
	
	System.out.println("-------------Wiskey------------");
	Wiskey2 newObj = new Wiskey2();
	newObj.brand();
	((Drinks2)newObj).percentage();
	((SoftDrink2)newObj).price();
	
	System.out.println("--------------Drinks-----------");
	Drinks drinks = new Gin();
	((Gin) drinks).flavour();
	drinks.percentage();
	
	System.out.println("--------------Object----------");
	Object object = new Gin();
	((Gin) object).flavour();
	((Drinks) object).percentage();
	
	
	
	
	}


