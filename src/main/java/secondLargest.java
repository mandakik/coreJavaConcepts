public class secondLargest {

    public static void main(String[] args) {

        int[] nums = {-8,-1,-4,-2,-1,-0 , -1, -5, -8, -9 ,-9, -4};

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int n : nums){
            if(n > largest){
                second_largest = largest;
                largest = n;
            } else if (n > second_largest && n <largest) {
                second_largest = n;
            }
        }

        System.out.println("largest : "+largest);
        System.out.println("second largest : "+second_largest);
    }
}
