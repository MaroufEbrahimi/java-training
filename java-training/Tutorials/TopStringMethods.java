public class TopStringMethods {
    public static void main(String[] args) {
        // length() method
        String s = "Hello";
        System.out.println(s.length());

        // charAt() method
        char c = "java".charAt(0);
        System.out.println(c);

        // substring() method
        String s2 = "Programming";
        System.out.println(s2.substring(0, 5));

        // toLowerCase() / toUpperCase() methods
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());

        // trim() method
        String s3 = "     Java     ";
        System.out.println(s3.trim());

        // equals() / equalsIgnoreCase() methods
        System.out.println("java".equals("java"));
        System.out.println("java".equalsIgnoreCase("JAVA")); // not case sensitive

        // contains() method
        System.out.println("Hello world".contains("Hello"));

        // replace() method
        System.out.println("Banana".replace('a', 'e'));

        // split() method
        String[] s4 = "a,b,c".split(",");
        System.out.println(s4[1]);

        // indexOf() method
        System.out.println("Hello".indexOf("ll"));
    }
}