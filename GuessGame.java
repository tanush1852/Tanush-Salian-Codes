/*Define the Player class with a abstract function named getGuess(). 
Define a class named HumanPlayer derived from Player.Implement abstract method in this class as getGuess() should prompt
the user to enter a number and return the value entered from the keyboard.
Next, define a class named ComputerPlayer derived from Player. 
The implementation of ComputerPlayer::getGuess() should randomly select a number from 0 to 100. 
 
Finally, construct a Main class with function play(Player player1, Player player2) and Checkanswer(int guess,int answer) functions
with a main function that invokes play(Player player1, Player player2) with two instances of a HumanPlayer (human vs. human), 
an instance of a HumanPlayer and ComputerPlayer (human vs. computer), and two instances of ComputerPlayer (computer vs. computer)
*/



import java.util.Scanner;

abstract class Player {
     abstract int getGuess();
}
class HumanPlayer extends Player{

     int getGuess()
    {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc1.nextInt();
        return n;
    }

}

class ComputerPlayer extends Player{

    int getGuess()
    {
        int n=(int)(Math.random()*(100+1));
        return n;
    }

}

public class Prog7b
{
    public static void play(Player Player1,Player Player2) {

            int ans1=Player1.getGuess();
            int ans2=Player2.getGuess();
            System.out.println("Numbers are "+ans1+" and "+ans2);
            Checkanswer(ans1,ans2);
    }

    public static void Checkanswer(int guess,int answer){
        Scanner sc3=new Scanner(System.in);
     if(guess==answer)
     {
         System.out.println("Numbers Matched,you win");

     }
     else
     {
         System.out.println("numbers unmatched,you lose");
     }
     System.out.println("Enter 1 to continue or enter 0 to exit");
     int num=sc3.nextInt();
     if(num==1)
     {
          main(null);
     }
     else{
         System.out.println("Game ended");
     }

    }

    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
        System.out.println("Ent your choice: 1)HUMAN VS HUMAN");
        System.out.println("2.HUMAN VS COMPUTERPLAYER");
        System.out.println("3.Computer vs Computer");
        int ch=sc.nextInt();
        switch(ch) {

            case 1:
                System.out.println("HUMAN VS HUMAN");
                Player H1 = new HumanPlayer();

                Player H2 = new HumanPlayer();
                play(H1, H2);
                break;


            case 2:

                System.out.println("HUMAN VS COMPUTERPLAYER");
                Player H3 = new HumanPlayer();
                Player c1 = new ComputerPlayer();
                play(H3, c1);
                break;

            case 3:
                System.out.println("Computer vs computer");
                Player c2 = new ComputerPlayer();
                Player c3 = new ComputerPlayer();
                play(c2, c3);
                break;

            default:
                System.out.println("Wrong choice entered");
                break;
        }



    }
}

