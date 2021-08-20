package StringMethods;

public class StringMethods8 {
    public static void main(String[] args) {

        String word="Java";
        System.out.println(word.replace('J','N'));

        word=word.replace('J','L');
        System.out.println(word);

        System.out.println(word.replace("a","o"));

        System.out.println(word.replace("La","ARA"));
        System.out.println(word.replace("Lava","Orange"));
        System.out.println(word);


        String str="  i have three apples";
        System.out.println(str);

        str=str.trim();
        System.out.println(str);

        String str2="      toyota       ";
        System.out.println(str2.trim());
        System.out.println(str2);




    }
}
