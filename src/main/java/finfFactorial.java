public class finfFactorial {

    public static int factorial(int num){
        if(num <= 1)
            return num;
        return num*factorial(num-1);
    }
    public static void main(String[] args) {

        int num = 5;
        System.out.println("factorial of "+num+" is : "+factorial(num));
    }
}
