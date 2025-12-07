public class extractDigitsFromString {

    public static void main(String[] args) {

        String str = "12/07/2025huhdnjncdk";

        str = str.replaceAll("[a-zA-Z]","");
        System.out.println(str);
    }
}
