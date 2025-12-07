import java.util.HashSet;
import java.util.Set;

public class removeDupFrmArray {

    public static void main(String[] args) {

        int[] nums = {4,1,2,8,9,0,2};

        //using sets
        Set<Integer> set = new HashSet<>();
        for(Integer n : nums){
            set.add(n);
        }

        System.out.println(set);
    }
}
