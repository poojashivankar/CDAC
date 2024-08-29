
class Calculator{
    public static void main(String[] args){
        int a=10;
        int b=20;
      String operation = "multiplication";
        switch(operation){
            case "addition":
                System.out.println("Addition is"+(a+b));
            break;
            case "substraction":
                 System.out.println("Substraction is"+(a-b));
            break;
            case "multiplication":
                System.out.println("MultipliCATION is"+(a*b));
            break;
             case "division":
                System.out.println("Division is"+(a/b));
            break;
             
        }
    }
}




/*Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if else to
 check if division by zero is attempted and display an error message.
 
 public class Aug21_Q3 {
    public static void main(String[] args) {
        int a, b;
        String operation;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        a = sc.nextInt();
        System.out.print("Enter the second number:");
        b = sc.nextInt(); System.out.print("Enter the operation:");
        operation = sc.next();
        switch (operation) {

            case "addition":
                System.out.println("Addition is" + (a + b));
                break;

            case "substraction":
                System.out.println("Substraction is" + (a - b));
                break;

            case "multiplication":
                System.out.println("Multiplication is" + (a * b));
                break;

            case "division":
                if (b == 0) {
                    System.out.println("Error: Divide by zero is not allowed!");
                } else {
                    System.out.println("Dividation is" + (a / b));

                }
                break;

            case "modulation":
                System.out.println("Modulation is" + (a % b));
                break;
            default:
                System.out.println("Invalid request!");
                break;

        }
        sc.close();
    }
}
  */