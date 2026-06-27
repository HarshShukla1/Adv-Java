enum Status
{                   //enums are the named constants
    Running,
    Failed,
    Success;
}

public class Enums {
    public static void main(String[] args) {
        int i=5;
        Status[] ss = Status.values();
        for(Status s:ss){
            System.out.println(s+ ":"+s.ordinal());
        }
        
    }
}
