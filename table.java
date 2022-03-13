import java.util.Scanner;
public class table{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to make multiplication table :");
        int number = sc.nextInt();
        int i = 1;
        while (i<=10){
            System.out.println(number + "X" + i + "=" + number*i);
            i++;

        } 
    }
}