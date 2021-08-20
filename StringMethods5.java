package StringMethods;

public class StringMethods5 {
    public static void main(String[] args) {

        String name="John";
        boolean bl1=name.startsWith("J");//-->true
        boolean bl2=name.startsWith("j");//-->false

        System.out.println(bl1);
        System.out.println(bl2);

        System.out.println(name.startsWith("Joh"));// true since first 3 letters are matching
        System.out.println(name.startsWith("Johy"));//false

        System.out.println(name.startsWith("John"));//true
        System.out.println(name.startsWith("john"));//false
        System.out.println("************************************");
        String name1="Sarah";

        System.out.println(name1.endsWith("h"));// -->true;
        System.out.println(name1.endsWith("ah"));//--true
        System.out.println(name1.endsWith("Sara"));// false
        System.out.println(name1.endsWith("sarah"));// false
        System.out.println(name1.endsWith("Sarah"));//true
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");


        String car="Lexus";

        System.out.println(car.contains("xu"));// -->true
        System.out.println(car.contains("Lxs"));//--> false, the order of letters also main
        System.out.println(car.contains("us"));//true









    }
}
