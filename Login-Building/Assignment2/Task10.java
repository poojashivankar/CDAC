public class Task10 {
public static void main(String[] args) {
System.out.println("No parameters");
}
public void display(int num) {
System.out.println("With parameter: " + num);
}
public static void main(String[] args) {
display();
display(5);
}
}


/*
public class Main {
public void display() {
System.out.println("No parameters");
}
public void display(int num) {
System.out.println("With parameter: " + num);
}
public static void main(String[] args) {
display();
display(5);
}
}

Task10.java:9: error: non-static method display() cannot be referenced from a static context
display();
^
Task10.java:10: error: non-static method display(int) cannot be referenced from a static context
display(5);
^
2 errors
*/
