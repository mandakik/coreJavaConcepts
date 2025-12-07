import java.util.ArrayList;
import java.util.Arrays;

public class FirstLastElement {
    public static void main(String[] args) {
        ArrayList<Character> list1 = new ArrayList<>(Arrays.asList('c','a','e','t','e'));

        System.out.println("first letter : "+list1.get(0));
        System.out.println("last letter : "+list1.get(list1.size()-1));
    }
}
