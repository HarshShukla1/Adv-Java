@FunctionalInterface
interface Lambda{
    int add(int a, int b);   //Lambda functions only work with function interfaces
}


public class LambdaFubctions {
    public static void main(String[] args) {
        Lambda obj = (a,b) ->  a+b;
            //Lambda expressions
        
        int result = obj.add(4, 6);
        System.out.println(result);
    }
}
