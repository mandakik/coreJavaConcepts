public class findMissingNumber {

    public static void main(String[] args) {

        int[] nums = {3,4,5,6,8};
        int actualSum=0;
        for(int i=0; i<nums.length-1; i++){
            actualSum = actualSum + nums[i];
        }

        int expectedSum=0;
        expectedSum = actualSum+nums[nums.length-1];

        System.out.println("actusl sum : "+actualSum);
        System.out.println("expected sum : "+expectedSum);
    }
}
