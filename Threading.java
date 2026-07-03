class outer extends Thread
{
    public void run()
    {
        for (int i = 1; i < 100; i++) {
             System.out.println("In outer show");
        }
       
    }
}

class inner extends Thread {
     public void run()
    {
        for (int i = 1; i < 100; i++) {
             System.out.println("In inner show");
        }
    }
    
}
class Threading            //in every thread have a run method
{
    public static void main(String[] args) {
        outer obj1 = new outer();
        inner obj2 = new inner();
        obj1.start();
        obj2.start();
    }
}
