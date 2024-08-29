class Discount{
    public static void main(String[] args){
        double total=400;
        double discountpercentage=0;
        boolean userhasmenbershipcard=true;
        if(total>=1000){
           discountpercentage=20.0;
        }
        else if(total>=500 && total<=999){
            discountpercentage=10.0;
        }
         else{
            discountpercentage=5.0;
        }
        if(userhasmenbershipcard){
             discountpercentage=5.0;
        }
      double discount=(discountpercentage/100)*total;
      double final_price=(total-discount);
    //   System.out.println(discount);
    //    System.out.println(final_price);
        System.out.println("Total Purchase: Rs." + total);
        System.out.println("Discount Applied: " + discountpercentage + "%");
        System.out.println("Discount Amount: Rs." + discount);
        System.out.println("Final Price After Discount: Rs." + final_price);
    }
}




/*Question 4: Discount Calculation 
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% disc
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%. 



class Discount {
    
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter price ");
    int price =sc.nextInt();
    System.out.println("Enter 1 if membership present else 0");
int membership = sc.nextInt();
    if(price >=1000){
        if(membership==1){
            System.out.println("Discount is : " + ((price*25)/100));
        }else{
            System.out.println("Discount is : "+(price*20)/100);
        }
    }else if(price >=500 && price<=999){
        if(membership==1){
            System.out.println("Discount is : "+(price*15)/100);
        }else{
        System.out.println("Discount is : "+(price*10)/100);
    }
    }else{
        if(membership==1){
System.out.println("Discount is : "+(price*10)/100);
        }else{
        System.out.println("Discount is : "+(price*5)/100);
    }
    }
}
}
*/