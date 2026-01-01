package codingBat;

public class repeatFront {

    /*Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).


    repeatFront("Chocolate", 4) → "ChocChoChC"
    repeatFront("Chocolate", 3) → "ChoChC"
    repeatFront("Ice Cream", 2) → "IcI"*/

    public static String repeatFrontStr(String str, int n){

        String finalStr="";

        if(n>=0){
            for(int i=n-1; n>=0; n--){
                finalStr += str.substring(0,n);
            }
        }

        return finalStr;
    }

    public static void main(String[] args) {
        System.out.println(repeatFrontStr("Chocolate", 4));
        System.out.println(repeatFrontStr("Ice Cream", 2));
        System.out.println(repeatFrontStr("Ice Cream", 1));
        System.out.println(repeatFrontStr("Ice Cream", 0));
        System.out.println(repeatFrontStr("xyz", 3));
        System.out.println(repeatFrontStr("", 0));
        System.out.println(repeatFrontStr("Java", 1));
        System.out.println(repeatFrontStr("Java", 2));
    }


}
