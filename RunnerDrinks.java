
public class RunnerDrinks {
	public static void main(String[] args) {
		
		
		System.out.println("-------------Gin------------");
		Gin whittley = new Gin();
		whittley.flavour();
		whittley.percentage();
		
		System.out.println("--------------Drinks-----------");
		Drinks drinks = new Gin();
		((Gin) drinks).flavour();
		drinks.percentage();
		
		System.out.println("--------------Object----------");
		Object object = new Gin();
		((Gin) object).flavour();
		((Drinks) object).percentage();
		
		
		}
	}


