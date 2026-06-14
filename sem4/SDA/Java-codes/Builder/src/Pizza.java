public class Pizza {
    private String size;
    private String crust;
    private String sauce;
    private String toppings;

    public void setSize(String size)     
    { 
    	this.size = size; 
    }
    
    public void setCrust(String crust)   
    {
    	this.crust = crust; 
    }
    
    public void setSauce(String sauce)   
    {
    	
    	this.sauce = sauce; 
    }
    
    public void setToppings(String t)    
    { 
    	this.toppings = t; 
    }

   
    public String toString() {
        return "Pizza [size=" + size + ", crust=" + crust + 
               ", sauce=" + sauce + ", toppings=" + toppings + "]";
    }
}