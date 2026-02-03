import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) {
            
         Scanner sc = new Scanner(System.in);

      int score = 0;

    System.out.println("Hi if you would like to take my quize please type '1' ");
        int play = sc.nextInt();

    if ( play == 1){
        int Game = 1;
      
          
        while (Game==1) {
            System.out.println("hi welcome to my basic Math Quiz");
         //System.out.println("to begin please enter your name ");

        // String name = sc.nextLine();

         System.out.println("Question 1: what is 5 + 5.");
         System.out.println("Please enter your answer with just Integers");
         int Answer1 = sc.nextInt();

        if (Answer1 == 10){
            System.out.println("Correct");
            score++;
            System.out.println("Question 2: what is 2 * 2?");
            System.out.println(" Please answer with just Integers");
            int Answer2 = sc.nextInt();
            if(Answer2 == 4){
                System.out.println("Correct!");
                 score++;
                System.out.println("Final Quaestion: What is 10/2?");
                System.out.println(" Please answer with just Integers");
                int Answer3 = sc.nextInt();
                if(Answer3 == 5){
                    System.out.println("Correct!");
                     score++;
                    System.out.println("thank you for taking my quiz you got"+score+"out of 3 correct");
                    System.out.println("if you would like to retake my quiz please enter 1 as a Integer");
                    System.out.println("if you would like to exit my quiz please enter 2 as a Integer ");
                    int A = sc.nextInt();
                    if (A == 1){

                    }else{ System.out.println("Thank you for playing ");
                        Game++;
                    }
                    


            }else{
                System.out.println("Wrong, You fail!");
                System.out.println("you only achived a score of "+score+" out of 3");
            
                Game++;
            }
            




        }else{
            System.out.println("Nope! You fail!");
            System.out.println("you only achived a score of "+score+" out of 3");

            Game++;
    
         
                         } 
                     }
    
                }
            }else{System.out.println("fine i dint want yu to take it anyways");}
     
     
            
    }
       

}
 
