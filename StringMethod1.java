package StringMethods;

public class StringMethod1 {
    public static void main(String[] args) {

        String str ="school";
        System.out.println(str.concat("time"));



        String str1= str.concat("time"); // schooltime-->declaring  new string;
        System.out.println(str);
        System.out.println(str1);

        str=str.concat(" is awesome");// re-assignment
        System.out.println(str);

        System.out.println(str1.concat(" 5"));
        System.out.println(str1);

        String bookName="Business";
        bookName=bookName.concat("Communication");
        System.out.println(bookName);

        System.out.println(bookName.length());

        int lengthofWord=bookName.length();
        System.out.println(lengthofWord);

        String word="Aizada";
        System.out.println(word.length());
        System.out.println(word.concat(" Abdyrakhmanova"));
        System.out.println(word.length());
        String word2=word.concat(" Abdyrakhmanova");
        System.out.println(word2.length());
        int lenght=word.length();
        System.out.println(lenght);

        String word3="David D"+"tech"; // 10 letters and 11 lenght with empty space
        System.out.println(word3.length());// it will consider even empty spaces.





    }
}
