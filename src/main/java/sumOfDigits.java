public class sumOfDigits {

    static int sum = 0 ;
    public static void calculateSum(int num){
        if(num <1)
            return;

        sum=sum+num%10;
        num = num/10;
        calculateSum(num);
    }
    public static void main(String[] args) {

        int num = 12345;
        calculateSum(num);
        System.out.println("sum of digits in "+num+" = "+sum);
    }
}
