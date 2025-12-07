public class printAtEvenOddIndex {

    public static void main(String[] args) {

        String str = "jsdhuiwahdksn";
        System.out.print("characters at odd indexes : ");
        for(int i=1; i<str.length(); i=i+2){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.print("characters at even indexes : ");
        for(int i=0; i<str.length(); i=i+2){
            System.out.print(str.charAt(i));
        }
    }
}
