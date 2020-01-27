public class Stock {

	//All Stocks have 3 things: stockName, numberOfShares, priceOfShare
	private String stockName;
	private int numberOfShares;
	private double priceOfShare;
	
	//Constructor: easy way to initialize variables. 
	//Provided for you. Observe, do not modify.
	public Stock(String name, int shares, double price)
	{
		stockName = name;
		numberOfShares = shares;
		priceOfShare = price;
	}

	//accessor for stockName - do not modify.
	public String getStockName() {
		return stockName;
	}

	//mutator for stockName - do not modify
	public void setStockName(String pStockName) {
		stockName = pStockName;
	}

	 // accessor for numerOfShares
	public int getNumberOfShares() {
		return numberOfShares;
	}
	
	//mutator for numberOfShares
	public void setNumberOfShares(int pNumberOfShares) {
		numberOfShares = pNumberOfShares;
	}

	//accessor for priceOfShares
	public double getPriceOfShare(){
		return priceOfShare;
	}
	
	//mutator for priceOfShare
	public void setPriceOfShare(double pPriceOfShare) {
		priceOfShare = pPriceOfShare;
	}



	//Calculate and return the stock value 
	public double calculateStockValue()
	{
		//stock value = price of the share * number of shares
		return numberOfShares * priceOfShare;
		
	}
	
	//Print the current values for all 3 instance variables in the specified format.
	public void printInfo()
	{
		
		System.out.println("Stock Name: " + stockName);
		System.out.println("Stock Quantity: " + numberOfShares);
		System.out.println("Stock Price: " + priceOfShare);
		
	}


}
