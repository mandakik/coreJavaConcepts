import java.util.HashMap;

public class dupElementInArray {

    public static void main(String[] args) {

        int[] nums = {4,1,2,7,8,9,0,2,3,4,5,1,2,7};

        HashMap<Integer, Integer> charCount = new HashMap<>();

        for(Integer i : nums){
            charCount.put(i, charCount.getOrDefault(i,0)+1);
        }

        System.out.println("hashmap : "+charCount);

        for(Integer i : charCount.keySet()){
            if(charCount.get(i) > 1){
                System.out.print(i+", ");
            }
        }
    }
}
