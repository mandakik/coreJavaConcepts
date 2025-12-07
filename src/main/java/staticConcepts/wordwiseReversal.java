package staticConcepts;

public class wordwiseReversal {

    public static String reverseWord(String str){
        if(str.length() <=1)
            return str;

        return str.charAt(str.length()-1)+reverseWord(str.substring(0,str.length()-1));
    }
    public static void main(String[] args) {
        String str = " Java is best programming language";

       String[] strArray =  str.split(" ");
       System.out.println("original string : "+str);
       System.out.print("reversed string : ");
       for(String s : strArray){
           System.out.print(reverseWord(s)+" ");
       }
    }
}
