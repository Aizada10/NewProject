package StringMethods;

import java.util.Locale;

public class StringMethods6 {
    public static void main(String[] args) {

        //equals()

        String studentName="Peter";
        String studentLastName="Montero";
        System.out.println(studentName.equals(studentLastName));//false
        System.out.println(studentName.equals("Peter"));//true
        System.out.println(studentLastName.equals("Montero"));//true

        studentName=studentLastName;// students name bacame as Montero(reassigning)
        System.out.println(studentLastName.equals(studentName));// ture

        studentName+=studentName;//MonteroMontero
        System.out.println(studentName);
        System.out.println(studentLastName.equals(studentName));
        System.out.println("_____________________________");

        String str1="Java IS Easy to LearN";
        String str2="Java is EASY to Learn";


        System.out.println(str1.equalsIgnoreCase(str2));//true,ignore cases upper or lower cathe doesn't matter

        str1=str1.toLowerCase(Locale.ROOT);
        str2=str2.toUpperCase(Locale.ROOT);
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equals(str2));//false


    }
}
