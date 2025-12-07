import java.util.Arrays;

public class sortArrays {

    public static void main(String[] args) {

        int[] nums = {2,1,3,7,8,9,3,2,0};

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]<nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];

                    nums[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
