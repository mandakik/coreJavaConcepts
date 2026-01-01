package codingBat;

public class sameStarChar {

    /*Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.


            sameStarChar("xy*yzz") → true
    sameStarChar("xy*zzz") → false
    sameStarChar("*xa*az") → true*/

    public static boolean sameStar(String str){
        for(int i=1; i<str.length()-1; i++){
            if(str.charAt(i)=='*'){
                if(str.charAt(i-1) != str.charAt(i+1)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sameStar("xy*yzz"));
        System.out.println(sameStar("xy*zzz"));
        System.out.println(sameStar("xa*az"));
        System.out.println(sameStar("*xa*bz"));
        System.out.println(sameStar("*xa*a*"));
        System.out.println(sameStar(""));
        System.out.println(sameStar("*xa*a*a"));
        System.out.println(sameStar("*xa*a*b"));
        System.out.println(sameStar("*12*2*2"));
        System.out.println(sameStar("12*2*3*"));
        System.out.println(sameStar("abcDEF"));
        System.out.println(sameStar("XY*YYYY*Z*"));
        System.out.println(sameStar("XY*YYYY*Y*"));
        System.out.println(sameStar("12*2*3*"));
        System.out.println(sameStar("*"));
        System.out.println(sameStar("**"));
    }
}
