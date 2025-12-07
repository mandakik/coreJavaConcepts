import java.util.HashMap;

public class charCountInString {

    public static void main(String[] args) {

        String str = "jwsiajkmdnjshgwiopqwslaldnf";
        HashMap<Character,Integer> charCount = new HashMap<>();
        for(Character c : str.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
        System.out.println(charCount);
    }
}
