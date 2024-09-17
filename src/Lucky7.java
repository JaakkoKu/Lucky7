import java.util.Random;
import java.util.Scanner;

public class Lucky7 {
    public static void main(String[] args){

        System.out.println("Welcome to the Lucky 7 game!");
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        

        System.out.println();
        System.out.println("Insert money to start the game!"); //Kysy käyttäjältä, kuinka paljon laittaa rahaa

        int money = scanner.nextInt();
        
        
        while (money > 0){
            money--;
            System.out.println("It cost 1€ to play. You have " + money + " left.");
            
        int die1 = generator.nextInt(10) +1;
        int die2 = generator.nextInt(10) +1;
        int die3 = generator.nextInt(10) +1;

        System.out.println(die1 + ", "+ die2 + ", " + die3); //Printtaa numerot
        int Win = 0;
        if (die1 == 7) Win++;
        if (die2 == 7) Win++;
        if (die3 ==7) Win++;
     
        
        if (Win == 1){
            money +=3;
            System.out.println("You won 3e!");
            System.out.println();
        }

        else if (Win == 2){
            System.out.println("You made a bigger pot! You won 5e!" );
            System.out.println();
            money +=5;
        }

        else if (Win == 3)
        {
            money +=10;
            System.out.println("You hit the Jackpot of 10e!");
            System.out.println();
        } 
        else
        {
            System.out.println("You lose!");
        }
        
          System.out.println("Do you want to roll the dices? You have " + money + " e left. Press enter to continue, n to stop.");
          
        scanner.nextLine();

        String answer = scanner.nextLine();
        if (answer.equals("n")){
            System.out.println("You left the game.");
            break;
            
        }
        if (money == 0){
            break;
        }

        }
          
    System.out.println("Game over! You have " + money + "e. If you want to play again, run the program again!");
        scanner.close();
        
        }
    }