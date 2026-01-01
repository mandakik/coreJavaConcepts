package codingBat;

public class mixString {

    /*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


    mixString("abc", "xyz") → "axbycz"
    mixString("Hi", "There") → "HTihere"
    mixString("xxxx", "There") → "xTxhxexre"*/

    public static String mixString(String a, String b){
        char[] str = new char[a.length()+b.length()];

        int i=0,j=0,k=0;

        for(; i<a.length() && j<b.length(); i++, j++){
            str[k++] = a.charAt(i);
            str[k++] = b.charAt(j);
        }

        while(i<a.length()){
            str[k++] = a.charAt(i++);
        }

        while(j<b.length()){
            str[k++] = b.charAt(j++);
        }

        return new String(str);
    }

    public static void main(String[] args) {

        System.out.println(mixString("abc","xyz"));
        System.out.println(mixString("2/", "27 around"));
        System.out.println(mixString("", ""));
        System.out.println(mixString("Long", "So"));
        System.out.println(mixString("xxxx", "There"));
        System.out.println(mixString("Abc", ""));
        System.out.println(mixString("", "Abc"));
    }
}
