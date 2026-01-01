package codingBat;

public class getSandwich {


    /*A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.


            getSandwich("breadjambread") → "jam"
    getSandwich("xxbreadjambreadyy") → "jam"
    getSandwich("xxbreadyy") → ""*/

    public static String getSandwichStr(String str){
        if(str.split("bread",-1).length-1 >1) {
            return str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
        }else{
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(getSandwichStr("breadjambread"));
        System.out.println(getSandwichStr("xxbreadjambreadyy"));
        System.out.println(getSandwichStr("xxbreadyy"));
        System.out.println(getSandwichStr("xxbreadbreadjambreadyy"));
        System.out.println(getSandwichStr("breadAbread"));
        System.out.println(getSandwichStr("breadbread"));
        System.out.println(getSandwichStr("abcbreaz"));
        System.out.println(getSandwichStr("xyz"));
        System.out.println(getSandwichStr(""));
        System.out.println(getSandwichStr("breadbreaxbread"));
        System.out.println(getSandwichStr("breaxbreadybread"));
        System.out.println(getSandwichStr("breadbreadbreadbread"));
    }
}
