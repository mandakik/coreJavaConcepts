import java.util.HashSet;

public class removeDupsFromArray {

    public static void main(String[] args) {

        int[] nums = {2,4,1,5,6,2,7,0,9,8,4,5,7,4};

        HashSet<Integer> uniqueNums = new HashSet<>();
        for(Integer n : nums){
            uniqueNums.add(n);
        }

        System.out.println("unique numbers : "+uniqueNums);
    }
}
