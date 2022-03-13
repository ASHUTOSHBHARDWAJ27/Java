import java.util.Scanner;

import java.util.Random;

public class stonepaper {
    public static void main(String[] args) {
        System.out.println("Lets play stone paper scissor with computer \n 0 for rock \n 1 for scissor \n 2 for paper ");
        // variables
        int computerpoint = 0;
        int userpoint = 0;
        int i=1;
        // gameloop
        while (i<=5) {
           
            // taking input from user 
            System.out.println("Enter your play:");
            Scanner sc = new Scanner(System.in);
            int userplay = sc.nextInt();
            
            // taking input from computer and print the
            Random r=new Random();
            int computerplay = r.nextInt(3);

            // printing the inputs of user and computer
            System.out.println("your play "+userplay);
            System.out.println("computer play "+computerplay);

            //conditions of game
            if(userplay==computerplay){System.out.println("Its tie");}
            else if(userplay==0  && computerplay==1 ){
                System.out.println("you are winner");
                userpoint += 1;}
            else if(userplay==1  && computerplay==2 ){
                System.out.println("you are winner");
                userpoint += 1;}
            else if(userplay==2  && computerplay==0 ){
                System.out.println("you are winner");
                userpoint += 1;}
            else if(userplay==0  && computerplay==2 ){
                System.out.println("you are loser");
                computerpoint += 1;
          }
            else if(userplay==1  && computerplay==0 ){
                System.out.println("you are loser");
                computerpoint += 1;
          }           
            else if(userplay==2  && computerplay==1 ){
                System.out.println("you are loser");
                computerpoint += 1;
          }           
            else{System.out.println("enter valid number");}
            i++;  
        }
//        CALCULATING THE POINTS AND DISPLAYING POINTS OF USER AND COMPUTER

        if (computerpoint < userpoint) {
            System.out.println("you wins");
            
        } else if(computerpoint > userpoint) {
            System.out.println("computer wins");
        }
        else{
            System.out.println("Its tie");
        }
        // printing the results
        System.out.println("your points: " + userpoint);
        System.out.println("computer points: "  + computerpoint);
   
    }}