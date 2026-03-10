import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class Midterm {
    
public static void main(String[] args) throws InterruptedException { //added the exception so that i can use timed breaks in my code - found this through google 
 
 
 Scanner sc = new Scanner(System.in);


 String[]Choices ={"Rock", "Paper","Scissors"};


System.out.println("hi, welcome to Rock Paper Scissors");

System.out.println("if you would like to play please type play if not type stop");
int losses = 0;
int wins = 0;
boolean game = true;
while(game){
String begin = sc.nextLine();
//String START = "start";




 if(begin.equalsIgnoreCase("play")){
     System.out.println("alright here is how to play ");
     System.out.println("its the basic game rock paper scissors");
     System.out.println("to select Rock type 1 for paper type 2 for scissors type 3");
     System.out.println("When your ready press ENTER");
     sc.nextLine();
        System.out.println("Rock!");
        Thread.sleep(1000);// previously mentioned time breaks all 1 second long
        System.out.println("Paper!");
        Thread.sleep(1000);
        System.out.println("Scissors!");
        Thread.sleep(1000);
        System.out.println("Shoot!");
    
    Random num = new Random();//creating the random so that i can have the computer 
    int CompChoice = num.nextInt(3);    
    System.out.println("What do you pick! Rock(1) Paper(2) Scissors(3)");
    int PlayerChoice = sc.nextInt();

    if (PlayerChoice == CompChoice) {
        System.out.println("Computer picked "+ CompChoice);
        System.out.println("It's a tie!");

        System.out.println("you have "+wins+" wins and "+losses+"Losses");
    }
    else if (PlayerChoice == 0 && CompChoice == 2) {
        System.out.println("Computer picked "+ CompChoice);
        System.out.println("You win!");
            wins++;
                System.out.println("you have "+wins+" wins and "+losses+"Losses");

    }
    else if (PlayerChoice == 1 && CompChoice == 0) {
         System.out.println("Computer picked "+ CompChoice);
        System.out.println("You win!");
            wins++;

                System.out.println("you have "+wins+" wins and "+losses+"Losses");

    }
    else if (PlayerChoice == 2 && CompChoice == 1) {
        System.out.println("Computer picked "+ CompChoice);
        System.out.println("You win!");
            wins++;

                System.out.println("you have "+wins+" wins and "+losses+"Losses");

    }
    else {
        System.out.println("Computer picked "+ CompChoice);
        System.out.println("You lose!");
            losses++;

                System.out.println("you have "+wins+" wins and "+losses+" Losses");

    }






 }else if(begin.equalsIgnoreCase("stop")){
     System.out.println("fine your loss");
        game = false;
 }else{
     System.out.println("not a valid responce");

 }
}



}
}
