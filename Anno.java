class A
{
public void showDataofthisclass()
{
    System.out.println(" in A show");
}
}
class B extends A
{
    @Override              //@ shows the intention for ex here override shows that user is overriding the method
                            // hence the compiler gives warning if there is bug
    public void showDataofthisclass()
    {
        System.out.println("in B show");
    }
}




public class Anno {
    public static void main(String[] args) {
        
    
    B obj = new B();
    obj.showDataofthisclass();
    }
}
