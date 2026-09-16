package java17features.patternmatching;

public class Main {
    static void main() {
        Object obj = 10;

        if(obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
        else if(obj instanceof Integer i) {
            System.out.println(i * 2);
        }
    }
}
