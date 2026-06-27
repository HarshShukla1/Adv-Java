interface Computer{
    public void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code,compile,run");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code,compile,run:fast");
    }
}
class dev
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}


public class Inter {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        dev harsh = new dev();
        harsh.devApp(lap);
    }
}
