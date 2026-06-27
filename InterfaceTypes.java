@FunctionalInterface
interface A {  //SAM interface
    void show();    
}
// class B implements A
// {
//     public void show()
//     {
//         System.out.println(" in SAM interface");
//     }
// }



public class InterfaceTypes {
    // 1- Normal interfaces -> with 2 or more methods
    // 2- Marker interfaces -> no method -> blank interface -> serialization -> take object store its value
    // 3- functional interfaces/SAM -> single abstract method -> only 1 method
    public static void main(String[] args) {
        
    
    A obj = () ->              //anonymous innerclass // Lamba function
System.out.println(" in SAM interface");
    obj.show();
    }
}
