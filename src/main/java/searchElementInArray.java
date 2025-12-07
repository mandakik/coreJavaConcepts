public class searchElementInArray {

    public static void main(String[] args) {
        int[] nums = {4,1,2,7,0,9,2,8,9};
        int search = 3;
        boolean found = false;

        for(Integer n : nums){
            if(n == search){
                found = true;
                System.out.println("element forund");
                break;
            }
        }
        if(!found){
            System.out.println("element not found");
        }
    }
}
