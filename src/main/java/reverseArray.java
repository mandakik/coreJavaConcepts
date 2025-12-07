import java.util.*;

public class reverseArray {

    public static void main(String[] args) {
        Integer[] nums = {3,1,2,6,7,8,9,0};

        System.out.println("********* using collections *************");
        Collections.reverse(Arrays.asList(nums));
        System.out.println("reversed array : "+Arrays.toString(nums));
        System.out.println("********* using for ************");
        for(int i=nums.length-1; i>0; i--){
            System.out.print(nums[i]);
        }

        System.out.println("********* using iterator ************");
        ListIterator<Integer> list = (Arrays.asList(nums)).listIterator();
        while(list.hasPrevious()){
            System.out.print(list.previous());
        }
    }
}
