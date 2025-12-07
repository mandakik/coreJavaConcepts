public class numberReversal_recursion {

    static int reversed_number = 0;

    public static void reverseNumber(int num){
        if(num == 0)
            return;

        reversed_number = reversed_number*10 + num%10;
        reverseNumber(num/10);
    }
    public static void main(String[] args) {

        int number = 34543;
        reverseNumber(number);
        if(number == reversed_number){
            System.out.println(number+" is a palindrome");
        }else{
            System.out.println(number+" is not a palindrome");
        }
    }
}
