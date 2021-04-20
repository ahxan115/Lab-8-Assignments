
package lab8_ha_2;


public class Computer {
    private int wordSize, memorySize , storageSize ,speed;
    public Computer(){
            this.wordSize = 0;
            this.memorySize = 0;
            this.storageSize = 0;
            this.speed = 0;
    }
    
    public Computer(int wordSize, int memorySize , int storageSize , int speed){
            this.wordSize = wordSize;
            this.memorySize = memorySize;
            this.storageSize = storageSize;
            this.speed = speed;
    }
    
    public int getwordSize(){
        return wordSize;
    }
    public void setwordSize(int wordSSize){
        this.wordSize = wordSize;
    }
     public int getmemorySize(){
        return memorySize;
    }
    public void setmemorySize(int memorySSize){
        this.memorySize = memorySize;
    }
      public int getstorageSize(){
        return storageSize;
    }
     public void setstorageSize(int storageSize){
        this.storageSize = storageSize;
    }
    public int getspeed(){
        return speed;
    }
    public void setSped(int Speed){
        this.wordSize = wordSize;
    }
    public void display(){
        System.out.println("Word Size: " + wordSize + " bits" + 
                "\nMemory Size: " + memorySize + " Mega Bytes" + 
                "\nStorage Size: " + storageSize + " Mega Bytes" + 
                "\nSpeed: " + speed + " Mega Hertz");
    }
    
    
}
