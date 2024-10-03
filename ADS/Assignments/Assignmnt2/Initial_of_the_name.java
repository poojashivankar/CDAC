import java.util.Scanner;
//find initials of the name

public class Initial_of_the_name{
    public static String get_initial(String fname){
        String[] word= fname.trim().split(" ");
        StringBuilder strb=new StringBuilder();
        for(String part : word){
            if(!part.isEmpty()){
            strb.append(part.charAt(0)).append(" ");
            }
        }
        return  strb.toString().toUpperCase();

    }
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the String");
String str=sc.nextLine();
String initi=get_initial(str);
System.out.println(initi);


    }
}