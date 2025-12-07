public class reverseString_inBuildFunc {

    //using recursion
    public static String reverseString(String str){
        if(str.length() <=1 ){
            return str;
        }

        return str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
    }
    public static void main(String[] args) {

        String str = "Automation";
        System.out.println("reversed string is : "+reverseString(str));

        //using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        System.out.println("reversed string : "+sb.reverse());

        //using for loop
        System.out.println("reversed string using loop is : ");
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
