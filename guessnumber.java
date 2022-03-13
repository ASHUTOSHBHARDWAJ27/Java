import java.util.Random;
import java.util.Scanner;

public class guessnumber {
    public static void main(String[] args) {
        //welcome of game
        System.out.println("Lets guess the number:");
        System.out.println("Guess a number in between 0 to 100");
        
        //genrating the number
        Random r=new Random();
        int computerguess=r.nextInt(100);
        int i=1;
        while(true){
            int numberoftimes=i;
            //taking input from user
            System.out.println("Enter your guess number:");
            Scanner sc=new Scanner(System.in);
            int userguess=sc.nextInt();
            //conditns
            if(userguess == computerguess){System.out.println("your guess is right");
            System.out.println("you guess right number in "+numberoftimes+" Times");
            break;}
            else if(userguess<computerguess){System.out.println("Its too low");}
            else if(userguess>computerguess){System.out.println("Its too high");}
            else{System.out.println("Guess a number in between 0 to 100");}
            i++;
    }

}}
