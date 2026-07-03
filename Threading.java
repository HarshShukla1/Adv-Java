class outer extends Thread
{
    public void run()
    {
        for (int i = 1; i < 50; i++) {
             System.out.println("In outer show");
             try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        }
       
    }
}

class inner extends Thread {
     public void run()
    {
        for (int i = 1; i < 50; i++) {
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
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        obj2.start();
    }
}
