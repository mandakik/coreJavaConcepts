public class isPalindrome {

    public static String reverseWord(String str){
        if(str.length()<=1)
            return str;
        return str.charAt(str.length()-1)+reverseWord(str.substring(0,str.length()-1));
    }

    public static int reverseNumber(int num){
        int reversedNum = 0;

        if(num ==0 ){
            return num;
        }else{
            while(num > 0) {
                reversedNum = reversedNum * 10 + num % 10;
                num = num / 10;
            }
        }
        return reversedNum;
    }
    public static void main(String[] args) {

        String str = "madam";
        if(str.equals(reverseWord(str))) {
            System.out.println(str + " is a Palindrome ");
        }else{
            System.out.print(str+" is not a palindrome");
        }

//check if number is palindrome
        int num = 12341;
        int reversedNumber = reverseNumber(num);
        if(num == reversedNumber){
            System.out.print(num+" is a palindrome");
        }else{
            System.out.print(num+" is not a palindrome"+" : reversed number is : "+reversedNumber);
        }
    }
}
