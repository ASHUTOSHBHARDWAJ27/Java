import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        while(true){
        //takking input from user
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the 1st number:");
            Double no1=sc.nextDouble();
            System.out.println("Enter the operation:");           
            char cal = sc.next().charAt(0);
            System.out.println("Enter  the 2nd number:");
            Double no2 = sc.nextDouble();
            
            //calculating the number 
            Double ans;
       
            if(cal=='+'){
                ans=no1+no2;
                System.out.println("The sum of two number is : " + ans );
            }
            else if(cal=='-'){
                ans=no1-no2;
                System.out.println("The subtraction of two number is : " +ans );
            }
            else if(cal=='*'){
                ans=no1*no2;
                System.out.println("The product of two number is : " +ans );
            }
            else if(cal=='/'){ 
                ans=no1/no2;    
                System.out.println("The division of two number is : " +ans);
        }}
        
            
    }
}

