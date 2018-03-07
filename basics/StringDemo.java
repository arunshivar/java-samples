package basics;

public class StringDemo {

    public static void main(String[] args) {

        String s1 = "a";
        String s2 = "a";

        System.out.println(s1 == s2);			// true
        System.out.println(s1.equals(s2));	    // true

        String s3 = new String("a");
        String s4 = new String("a");

        System.out.println(s3 == s4);			// false
        System.out.println(s3.equals(s3));      // true

        String s5 = "ab";
        String s6 = "a" + "b"; // s6 = "ab";

        String s7 = "a";
        String s8 = s7 + "b";

        System.out.println(s5 == s6);	//true
        System.out.println(s6 == s8);   //false
    }
}
