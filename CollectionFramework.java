import java.util.ArrayList;
import java.util.List;

public class CollectionFramework {
    static List<Integer> duplicate(int[] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        if (arr == null || arr.length < 2)
            return nums;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                nums.add(arr[i]);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 3, 4 };
        List<Integer> nums = new ArrayList<>();
        nums = duplicate(arr);
        System.out.println(nums);
    }
}
 