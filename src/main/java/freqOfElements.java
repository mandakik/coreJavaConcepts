import java.util.HashMap;

public class freqOfElements {

    public static void main(String[] args) {

        String str = "jshdui;jlwaskmxkjsbfsnmsdns";

        HashMap<Character, Integer> map = new HashMap<>();

        for(Character c : str.toCharArray()){
            if(Character.isAlphabetic(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }

        System.out.println("Map : "+map);
    }
}
