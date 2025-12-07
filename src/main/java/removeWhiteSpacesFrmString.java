public class removeWhiteSpacesFrmString {

    public static void main(String[] args) {

        String str = "hids      dsjkfn d f f d    ";

        System.out.println("after white space removal : "+str.replaceAll(" ",""));
    }
}
