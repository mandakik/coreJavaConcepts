import java.util.*;

public class listToSet {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,4,6,7,9);

        //list to set
        Set<Integer> set = new HashSet<>(list);
        System.out.println("set : "+set);


        //set to list
        HashSet<Character> hashset = new HashSet<>(Arrays.asList('c','a','t','p','k'));
        List<Character> list1 = new ArrayList<>(hashset);
        System.out.println("list : "+list1);

    }
}
