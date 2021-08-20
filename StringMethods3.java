package StringMethods;

public class StringMethods3 {
    public static void main(String[] args) {

        String school="techtorial";
        System.out.println(school.indexOf("t"));//it will return first matching chars index
        System.out.println(school.indexOf('t'));
        System.out.println(school.indexOf("te"));// it will return first matching chars from "te"
        System.out.println(school.indexOf("to"));// it will return number of "t" before letter "O"
        System.out.println(school.indexOf("cht"));// will return first matching char
        System.out.println(school.indexOf("ti"));//it will return -1
        System.out.println(school.indexOf("k"));// it will return -1
        System.out.println(school.indexOf("t",1));

        int x=school.indexOf("a");
        System.out.println("the index of letter is stored in the integer is--> "+x);


    }
}
