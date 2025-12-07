public class strLength {

    public static void main(String[] args) {

        String str = "hdiudslkjfndghfbdsjkfneik";
        int len = 0;

        //using for each loop
        for (Character c : str.toCharArray()) {
            len++;
        }
        System.out.println("string length : " + len + " : " + str.length());

        //using indexOf
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            System.out.println("length of str : " + count);
        }
    }
}