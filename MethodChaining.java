package StringMethods;

import java.util.Locale;

public class MethodChaining {
    public static void main(String[] args) {

        String str= "just do it ";
        System.out.println(str.replace("do","copy").concat("if you can")
                .toUpperCase().substring(5).length());//result is integer which is 18

        String test="  TEST";

        //System.out.println(test.toLowerCase().replace(test.charAt(test.indexOf('e')),'o').contains("es"));

        System.out.println(test.trim().substring(3).length());







    }
}
