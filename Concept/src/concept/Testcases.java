package concept;

public class Testcases {

	 
	public double priceGetter(IPizza ipizza)
	{
		double price = 0;
	

			if (ipizza instanceof ChickenPizza) {
				price = 10;

			}

			if (ipizza instanceof PepproniPizza) {
		
				price = 20;
			}

			if (ipizza instanceof VeganPizza) {
			
				price = 30;
			}
			if (ipizza instanceof MargaritaPizza) {
			
				price = 40;
			}
			
	return price;
}
}
