public class sumArrayDigits {

    public static void main(String[] args) {

        String str = "jhsj628n3n1n09";
        int sum=0;
        for(Character c : str.toCharArray()){
            if(Character.isDigit(c)){
                sum = sum+Integer.parseInt(String.valueOf(c));
            }
        }
        System.out.println("sum : "+sum);
    }
}
