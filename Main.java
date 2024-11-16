// Your First Program
import java.util.Random;
import java.util.Scanner;


class Main {

    /* static void sum(int x, int y){
         int result = x + y;
        System.out.println("the sum of x + y is: "+result);
        }   */

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Random random = new Random();

        String choices[] =  {"rock", "paper", "scissors"};

        
        System.out.println("\tRock, Paper, Scissors"); 
        System.out.println("Enter your choice: ");
        String player_choice = input.nextLine();

        boolean valid = validation(player_choice, choices);

        if(!valid){
            do {
                System.out.println(player_choice + " is not valid.");
                System.out.println("Please enter a valid choice.");
                player_choice = "";
                String player_choice1 = input.nextLine();
                valid = validation(player_choice1, choices);
            }while(!valid);
        }


        System.out.println("Computer is choosing...");
        int random_index = random.nextInt(choices.length);
        String computer = choices[random_index];

        System.out.println("Computer chose " + computer);

        if(checkWinner(player_choice, computer)){
            System.out.println("PLAYER WINS!!");
        }
        
        else if(isTie(player_choice, computer)){
            System.out.println("IT'S A TIE!!!");
        
        }

        else if(!checkWinner(player_choice, computer) && !isTie(player_choice, computer)){
            System.out.println("YOU LOSE!!");
        }
    
    }

    public static boolean validation(String choice, String choices[]){

        for(String value : choices){
            if(choice.equals(value)){
                return true;
            }
        }
        return false;
    }

    public static boolean isTie(String player, String computer){
            if (player.equals(computer)){
                return true;
            }
            return false;
    }

    public static boolean checkWinner(String player, String computer){
        if(player.equals("rock") && computer.equals("scissors")){
            return true;
        }
        else if (player.equals("paper") && computer.equals("rock")){
            return true;
        }
        else if (player.equals("scissors") && computer.equals("paper")){
            return true;
        }
        return false;
    }

}