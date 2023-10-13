import java.util.Scanner;
public class GamePlay{
    Scanner scan = new Scanner(System.in);
    private int guessLocationR;
    private int guessLocationC;
    public void makeGuess(int[][] guessBoard){
        do{
        System.out.println("Enter your guess (ex. A2): ")
        String guessLocationString = scan.nextLine();
        guessLocationR = scan.nextLine().charAt(0) - 65;
        guessLocationC = scan.nextLine().charAt(1) - 48;
        guessBoard[guessLocationR][guessLocationC] = 1;
        }
        while((guessLocationR < 65 && guessLocationR > 74) && (guessLocationC < 48 && guessLocationC > 57) );

    }
    
    public void guessHit(int numRows, int numCols, int[][] gameBoard, int guessLocationR, int guessLocationC, String guessLocationString, int[][] guessBoard){
        if(guessBoard[guessLocationR][guessLocationC] == gameBoard[guessLocationR][guessLocationC])
            System.out.println("You hit a ship at " + guessLocationString + " !");
            guessBoard[guessLocationR][guessLocationC] = 3;
        }
        else if(guessBoard[guessLocationR][guessLocationC] != gameBoard[guessLocationR][guessLocationC]){
            System.out.println("There is no ship at " + guessLocationString + " !"); 
        }
    }



}