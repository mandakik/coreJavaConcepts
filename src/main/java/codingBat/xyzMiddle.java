package codingBat;

public class xyzMiddle {


/*    Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.


    xyzMiddle("AAxyzBB") → true
    xyzMiddle("AxyzBB") → true
    xyzMiddle("AxyzBBB") → false*/

    public static boolean isXyzMiddle(String str){
        boolean flag = false;

        for(int i=0; i<=str.length()-3; i++){
            if(str.substring(i,i+3).equals("xyz")){
                int left = i;
                int right = str.length()-(i+3);
                if(Math.abs(left-right) <2){
                    return true;
                }
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        /*System.out.println(isXyzMiddle("AAxyzBB"));
        System.out.println(isXyzMiddle("AxyzBB"));
        System.out.println(isXyzMiddle("AxyzBBB"));*/
        System.out.println(isXyzMiddle("xyz"));
    }
}
