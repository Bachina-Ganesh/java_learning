package strings;

public class Main {
    static void main() {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2;
        String s4 = new String("Hello");

        System.out.println(s1 == s4);
        System.out.println(s1 == s3);
        String s5 = s1;
        System.out.println(s1 == s5);

        final String s6 = "Hello";
        final String s7 = "World";
        String s8 = s6 + s7;
        System.out.println(s3 == s8);

        String s9 = s4.intern();
        System.out.println(s1 == s9);
        System.out.println(s4 == s9);

        String s10 = s1;
        System.out.println(s1 == s10);

    }
}
