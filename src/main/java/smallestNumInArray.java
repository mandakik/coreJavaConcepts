import java.util.Arrays;
import java.util.Collections;

public class smallestNumInArray {

    public static void main(String[] args) {

        Integer[] num = {-9,2,1,7,9,2,0,0,-1};

        System.out.println("smallest number in an array : "+Collections.min(Arrays.asList(num)));

        int smallest = num[0];
        for(int n : num){
            if(n < smallest)
                smallest = n;
        }

        System.out.println("smallest in array is : "+smallest);
    }
}
