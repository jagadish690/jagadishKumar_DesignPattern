package BridgePattern;

public class BridgePatternDemo {
public  String test1() {
	    	  Shape redCircle = new Circle(100,100, 10, new RedCircle());
	    	  return redCircle.draw();  
	      }
	      public  String test2() {
	    	  Shape greenCircle = new Circle(100,100, 10, new GreenCirle());
	    	  return greenCircle.draw();  
	      }
	      
	   }