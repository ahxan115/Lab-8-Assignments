
package lab8_h.a_1;


public class Tape extends Publication {
     
    // adds playing time in minute
    private float minutes;
    
    public Tape(){
        this.minutes = 0;
    }
    public Tape( float minutes){
        this.minutes = minutes;
    }
    //  set() and get() methods
    
    public float getminutes(){
        
        return minutes;
    }
    public void setminutes(){
        this.minutes = minutes;
    }
    
    
    // Display Function
    public void Display(){
        System.out.println("Enter Minutes: " + minutes);
    }
}

