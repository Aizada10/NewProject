package StringMethods;

import java.util.Locale;

public class StringMethods4 {
    public static void main(String[] args) {

        String city="Chicago is COLD";

        String lower=city.toLowerCase(Locale.ROOT);
        System.out.println(lower);

        String upper=city.toUpperCase(Locale.ROOT);
        System.out.println(upper);

        String state="IllinoisIsWeird";
        System.out.println(state.toLowerCase(Locale.ROOT));
        System.out.println(city.toUpperCase(Locale.ROOT));




    }
}
