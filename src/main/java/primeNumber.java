public class primeNumber {

    public static boolean isPrimeNo(int num){
        if(num < 2)
            return false;
        for(int i=2 ; i<num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        int num = 2;
        System.out.println(num+" is Prime ?? "+isPrimeNo(num));
    }
}
