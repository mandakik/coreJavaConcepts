package codingBat;

public class repeatEnd {

    /*Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.


    repeatEnd("Hello", 3) → "llollollo"
    repeatEnd("Hello", 2) → "lolo"
    repeatEnd("Hello", 1) → "o"*/

    public static String repeatEndStr(String str, int n){
        String finalStr="";

        if(n>=1){
            for(int i=0; i<n; i++){
                finalStr += str.substring(str.length()-n);
            }
        }

        return finalStr;
    }

    public static void main(String[] args) {
        System.out.println(repeatEndStr("Hello", 3));
        System.out.println(repeatEndStr("Hello", 2));
        System.out.println(repeatEndStr("Hello", 1));
        System.out.println(repeatEndStr("Hello", 0));
        System.out.println(repeatEndStr("abc", 3));
        System.out.println(repeatEndStr("1234", 2));
        System.out.println(repeatEndStr("1234", 3));
        System.out.println(repeatEndStr("", 0));
    }
}
