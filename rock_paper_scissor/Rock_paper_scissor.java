
package rock_paper_scissor;

import java.util.*;

/**
 *
 * @author ARPAN KUMAR SINGH
 */
public class Rock_paper_scissor {

    
    public static void main(String[] args) {
        //creating rock paper scissors game
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for ROCK");
        System.out.println("Enter 1 for PAPER");
        System.out.println("Enter 2 for SCISSOR");
        int game=0;
        int computer_choice;
        int your_choice;
        int computer_points=0;
        int your_points=0;
        while(game<5)
        {
            Random rand=new Random();
            computer_choice=rand.nextInt(2);
            your_choice=sc.nextInt();
            switch (your_choice)
                    {
                case 0:System.out.println("You choose Rock!");
                break;
                case 1:System.out.println("You choose Paper!");
                break;
                case 2:System.out.println("You choose Scissor!");
          
            }
             switch (computer_choice)
                    {
                case 0:System.out.println("Computer choose Rock!");
                break;
                case 1:System.out.println("Computer choose Paper!");
                break;
                case 2:System.out.println("Computer choose Scissor!");
          
            }
            if(computer_choice==your_choice)
            {
                System.out.println("Match tie!");
            }
            else  if(computer_choice==0 &&  your_choice==1)
            {
                System.out.println("You won!//paper will cover the rock");
                your_points++;
            }
            else if(computer_choice==0 &&  your_choice==2)
            {
                System.out.println("Computer won!//rock will brerak the scissor");
                computer_points++;
            }
            else if(computer_choice==1 &&  your_choice==0)
            {
                System.out.println("Computer won!//paper will cover the rock");
                computer_points++;
            }
            else if(computer_choice==1 &&  your_choice==2)
            {
                System.out.println("You won!//scissor will cut the paper");
                your_points++;
            }
            else if(computer_choice==2 &&  your_choice==0)
            {
                System.out.println("You won!//rock will break the scissor");
                your_points++;
            }
            else if(computer_choice==2 &&  your_choice==1)
            {
                System.out.println("Computer won!//scissor will cut the paper");
                computer_points++;
            }
            if(game==5)
                break;
            game++;
            
            
            
        }
        System.out.println("----------------------------------------");
        System.out.println("your points ="+your_points+" "+"computer points ="+computer_points);
        System.out.println("----------------------------------------");
        if(computer_points<your_points)
        {
            System.out.println("YOU WON THE GAME! //Congratulations");
        }
        else if(computer_points>your_points)
        {
            System.out.println("COMPUTER WON THE GAME! //Better luck next time");
        }
        else
        {
            System.out.println("GAME TIE!");
        }
        
    }
    
}
