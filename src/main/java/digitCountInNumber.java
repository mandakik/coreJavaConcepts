public class digitCountInNumber {

    public static void main(String[] args) {

        int num = 1036483;
        int k=0;

        while(num>0){
            k++;
            num=num/10;
        }

        System.out.println(k);
    }
}
