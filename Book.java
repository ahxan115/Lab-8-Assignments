
package lab8_h.a_1;


public class Book extends Publication {
    
    // adds a page count
    private int pages;
    
    public Book(){
        this.pages = 0;
    }
    public Book(int pages){
        this.pages = pages;
    } 
    
    // get() method
    public int getpages(){
         
         return   pages;
    }
    
    // set() method
    public void setpages(int pages){
        this.pages = pages;
    }
    
    //Display function
    public void Display(){
        System.out.println( "Enter Pages: " + pages);
    }
    

    
}
