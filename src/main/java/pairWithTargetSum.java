public class pairWithTargetSum {

    public static void main(String[] args) {

        int[] nums = {4,1,2,7,8,0,2,9,3};
        int targetSum = 11;
        boolean found = false;

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if((nums[i]+nums[j]) == targetSum){
                    System.out.println("pair found : "+nums[i]+" : "+nums[j]);
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
    }
}
