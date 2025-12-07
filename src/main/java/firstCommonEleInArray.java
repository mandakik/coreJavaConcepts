public class firstCommonEleInArray {

    public static void main(String[] args) {

        int[] nums1 = {0,2,3,1,7,8,0};
        int[] nums2 = {4,1,8,9,2,3,1};
        boolean found = false;

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    System.out.println("first common element : "+nums1[i]);
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
