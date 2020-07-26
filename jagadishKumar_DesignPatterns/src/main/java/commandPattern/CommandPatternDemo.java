package commandPattern;

public class CommandPatternDemo {
	   public String Buy(){
	      Stock abcStock = new Stock();

	      BuyStock buyStockOrder = new BuyStock(abcStock);
	      

	      Wendor wendor = new Wendor();
	      wendor.takeOrder(buyStockOrder);
	     return wendor.placeOrders();
	   }
	   public String Sell(){
		      Stock abcStock = new Stock();

		      SellStock sellStockOrder = new SellStock(abcStock);
		      

		      Wendor wendor = new Wendor();
		      wendor.takeOrder(sellStockOrder);
		     return wendor.placeOrders();
		   }
		}
