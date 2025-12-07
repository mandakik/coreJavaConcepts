public class printLetterTwice {

    public static void main(String[] args) {

        String str = "abcd"; // o/p : aabbccdd
        for(Character c : str.toCharArray()){
            System.out.print(c);
            System.out.print(c);
        }
    }
}
