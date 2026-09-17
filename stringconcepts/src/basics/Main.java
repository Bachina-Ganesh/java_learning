package basics;

public class Main {
    static void main() {
        String s1 = "Hello";
        String s2 = "World";

        StringBuilder s3 = new StringBuilder("Hello");
        StringBuffer s4 = new StringBuffer("World");

        StringBuilder s5 = s3;
        String s6 = s1;
//        System.out.println(s3);
//        System.out.println(s5);
//
//        s3.append(" World");
//        System.out.println(s3);
//        System.out.println(s5);
        StringBuilder s7 = new StringBuilder("Hello");
        String s8 = "Hello";

        System.out.println(s3.equals(s5));
        System.out.println(s1.equals(s6));
        System.out.println(s3.equals(s7));
        System.out.println(s1.equals(s8));
    }
}
