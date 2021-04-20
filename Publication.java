
package lab8_h.a_1;


public class Publication {
    // stores Title and price of publication
    private String title;
    private int price;
    
    public Publication(){
        this.title = "";
        this.price = 0;
        
    }
    
    public Publication( String title, int price){
        this.title = title;
        this.price = price;
    }
    //  set() and get() methods
    public String gettitle(){
        
        return title;
    }
    public void settitle(){
        this.title = title;
    }
    public float getprice(){
        
        return price;
    }
    public void seprice(){
        this.price = price;
    }
     
    // Display function
    public void Display()
	{
		System.out.println("Enter Title: " + title + "\nEnter Price: $" + price);
        }
}
