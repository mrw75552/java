public class Portfolio {

	public static void main(String[] args) {

		double portfolioValue = 0.0;

		Stock appl = new Stock("Apple", 1000, 50.0);
		Stock ge = new Stock("General Electric", 1001, 51.0);
		Stock gm = new Stock("General Motors", 2001, 25.0);
		Stock amzn = new Stock("Amazon", 10000, 500.0);
		Stock fb = new Stock("Facebook",300,75.0);
		Stock lnkd = new Stock("LinkedIn",500,100.0);

		amzn.printInfo();
		appl.printInfo();
		fb.printInfo();
		ge.printInfo();
		gm.printInfo();
		lnkd.printInfo();
		
		portfolioValue = appl.calculateStockValue()+ge.calculateStockValue()+gm.calculateStockValue()+amzn.calculateStockValue()+lnkd.calculateStockValue()+fb.calculateStockValue();
		
		System.out.println("Total value of portfolio: $" + portfolioValue);


	}

}
