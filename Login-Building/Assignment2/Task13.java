public class Task13 {
public static void main(String[] args) {
String str = null;

        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("String is null");
        }
}
}


/*
public class Main {
public static void main(String[] args) {
String str = null;
System.out.println(str.length());
}
}


Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        at Task13.main(Task13.java:4)
*/
