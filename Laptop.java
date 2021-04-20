
package lab8_ha_2;


public class Laptop extends Computer{
     private int length, width, height, weight;
    public Laptop(){
       super();
        length = 0;
        width = 0;
        height = 0;
        weight = 0; 
    }
    
    public Laptop(int wordSize,int  memorySize, int storageSize, double speed,
                  int length, int width, int height, int weight)
    {
        
        this.length = length;
        this.weight = weight;
        this.height = height;
        this.weight = width;
    }

   
    public int getlength(){
        return length;
    }
    public void setlength(int length){
        this.length = length;
    }
     public int getwidth(){
        return width;
    }
    public void setmemorySize(int memorySSize){
        this.width = width;
    }
      public int getheight(){
        return height;
    }
     public void setheight(int height){
        this.height = height;
    }
    public int getweight(){
        return weight;
    }
    public void setweight(int weight){
        this.weight = weight;
    }
    public void display(){
     super.display();
                
       System.out.println( 
                "\nLength: " + length +
                "\nWidth: " + width +
                "\nHeight: " + height +
                "\nWeight: " + weight);
    }
 
    
}


