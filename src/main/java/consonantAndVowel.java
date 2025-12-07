public class consonantAndVowel {

    public static void main(String[] args) {

        String str = "heandut  &()onsuyrl";
        int vowel = 0;
        int consonant = 0;

        for(int i=0; i<str.length(); i++){
            Character c = str.charAt(i);
            if(Character.isAlphabetic(c)){
                if(c == 'a' || c=='e' || c=='i' || c =='o'|| c=='u'){
                    vowel++;
                }else{
                    consonant++;
                }
            }
        }
        System.out.println("string : "+str);
        System.out.println("consonant count : "+consonant);
        System.out.println("vowel count : "+vowel);
    }
}
