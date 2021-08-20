package StringMethods;

public class EqualsMethod {

    public static void main(String[] args) {

        String name1="John";// goes to string pool

        String name2="John";// to string pool

        String name3=new String("John");// goes to heap

        String name4=new String ("John");// goes to Heap

        System.out.println(name1==name2);//true
        System.out.println(name2==name3);//false
        System.out.println(name3==name4);//false

        String name5=name1;//using from string pool
        String name6=name3;// using from name3/heap
        String test="John";
        System.out.println(name1.equals(test));//true

        System.out.println(name5==name3);//false
        System.out.println(name5.equals(name3));//true,because value is the same



    }
}
