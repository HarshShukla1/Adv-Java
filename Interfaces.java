interface P{
    int age=25;            //all variables inside interface are final and static
    String area="Mumbai";
     void show();
     void config();
}

//class - class ->extends
//class - implements -> implements
//interface - interface -> extends

class Q implements P //we only declare methods
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
}
 //interfaces dont have memories in heap

public class Interfaces {
    public static void main(String[] args) {
        P obj;
        obj = new Q();
        obj.config();
        obj.show();
        System.out.println(P.area);
    }
}
