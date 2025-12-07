public class isArraySorted {

    public static void main(String[] args) {

        //int[] nums = {4,1,4,7,8,9,0,1};
        int[] nums = {0,3,7,8,9,11};
        boolean sorted = false;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]) {
                sorted = false;
                break;
            }
            sorted = true;
        }

        if(sorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
