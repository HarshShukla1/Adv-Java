import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,3,7,8);
        // Stream<Integer> s1 = nums.stream();
        // s1.forEach(n-> System.out.println(n));

        int result = nums.stream()
        .filter(n-> n%2==0)
        .map(n -> n*2)
        .reduce(0,(c,e)-> c+e);

        System.out.println(result);
    }
}
