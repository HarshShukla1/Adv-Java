public class ExceptionHandling {
    public static void main(String[] args) {
        int i=0,j=0;
        int nums[] = new int[5];
        


        try {
            j=8/j;
            System.out.println(nums[6]);
            System.out.println(nums[1]);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("something is wrong :"+e);
            
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("something is wrong :"+e);
            
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
