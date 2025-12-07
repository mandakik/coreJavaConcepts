public class caseConversion {

    public static void main(String[] args) {

        String str = "AkdnJKKKMMbbJbJn";
        StringBuffer sb = new StringBuffer();
        for(Character c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(Character.toUpperCase(c));
            }
        }

        System.out.println("original string : "+str);
        System.out.println("toggled string : "+sb);
    }
}
