import java.util.Arrays;
import java.util.Collections;

public class largestNumInArray {

    public static void main(String[] args) {

        Integer[] nums = {-2,-1,-5,-1,-9,-8,-3,-1};

        int largest = Integer.MIN_VALUE;

        for(int n : nums){
            if(n > largest)
                largest = n;
        }

        System.out.println("largest number in array is : "+largest);
        int maxNumber = Collections.max(Arrays.asList(nums));
        System.out.println("largest number in array is : "+maxNumber);
    }
}
