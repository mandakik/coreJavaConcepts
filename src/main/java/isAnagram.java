import java.util.Arrays;

public class isAnagram {

    public static void main(String[] args) {

        String str1 = "debit card";
        String str2 = "bad credit1";

        char[] str1_charArray = str1.replaceAll(" ","").toCharArray();
        char[] str2_charArray = str2.replaceAll(" ","").toCharArray();

        Arrays.sort(str1_charArray);
        Arrays.sort(str2_charArray);

        //equals & == compares memory address in arrays

        if(Arrays.equals(str1_charArray,str2_charArray)){
            System.out.println("strings are anagram");
        }else{
            System.out.println("strings are not anagram");
        }


    }
}
