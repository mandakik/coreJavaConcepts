import java.util.Arrays;

public class mergeTwoSortedArray {

    public static void main(String[] args) {

        int[] nums1 = {0, 2, 5, 8, 9};
        int[] nums2 = {0, 1, 3, 4, 7, 8};
        int[] mergedArray = new int[nums1.length + nums2.length];

        int i=0, j=0, k=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                mergedArray[k++]=nums1[i];
                i++;
            }else{
                mergedArray[k++]=nums2[j];
                j++;
            }
        }

        while(i< nums1.length){
            mergedArray[k++]=nums1[i];
            i++;
        }

        while(j< nums2.length){
            mergedArray[k++]=nums2[j];
            j++;
        }

        System.out.println("merged array : " + Arrays.toString(mergedArray));
    }
}
