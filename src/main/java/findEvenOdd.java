import java.util.ArrayList;
import java.util.List;

public class findEvenOdd {

    public static void main(String[] args) {
        int[] nums = {3,1,5,8,9,0,2,4,6,3};

        List<Integer> evenNums = new ArrayList<>();
        List<Integer> oddNums = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                evenNums.add(nums[i]);
            }else{
                oddNums.add(nums[i]);
            }
        }

        System.out.println("even numbers : "+evenNums);
        System.out.println("odd numbers : "+oddNums);
    }
}
