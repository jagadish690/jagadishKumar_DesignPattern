package factoryMethod;



public class GetPlanFactory {
	public Plan getPlan(String planType){  
        if(planType == null){  
         return null;  
        }  
      if(planType.equalsIgnoreCase("standard")) {  
             return new Standard();  
           }   
       else if(planType.equalsIgnoreCase("Abovestandard")){  
            return new AboveStandard();  
        }   
      else if(planType.equalsIgnoreCase("Highstandard")) {  
            return new HighStandard();  
      }
      else if(planType.equalsIgnoreCase("HighstandardFullautomatic")) {  
    	  return new HighstandardFullAutomatic();
      }
  return null;  
}  
}