abstract class Car
{
    public abstract void drive(); 
    public abstract void fly(); 
     //basically when we dont know what to do 
    // in a function at that tym 
    // but we know that this function is needed
    //  then we use abstract to just declare a method
    public void playMusic()
    {
        System.out.println("play music");     
    }
}
class WagonR extends Car
{
    public void drive()
    {
        System.out.println("Driving");
    }
    public void fly()
    {
        System.out.println("flying");
    }
}


public class Abstract {
    public static void main(String[] args) {
        Car obj = new WagonR();     //cant create obj of an abstract class
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
