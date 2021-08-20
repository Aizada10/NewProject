package StringMethods;

public class StringMethods7 {
    public static void main(String[] args) {

        String string="California";

       String result1=string.substring(0);
       String result2=string.substring(1);

        System.out.println(result1);
        System.out.println(result2);

        String result3=string.substring(1,4);
        System.out.println(result3);

        string=string.concat(" is a great state.");
        System.out.println(string);
        String result4=string.substring(5,10);
        System.out.println(result4);
        System.out.println(string.substring(11,string.indexOf(".")));

        result4.substring(2,3);// ornia
        System.out.println(result4.substring(2,3));
        System.out.println(result4.substring(2));

    }
}
