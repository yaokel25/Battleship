import java.util.Scanner;
public class GamePlay{
    Scanner scan = new Scanner(System.in);
    public int guessLocationR;
    public int guessLocationC;
    public int[][] guessBoard = new int[10][10];//10 is size of array
    public void makeGuess(){
        do{
        System.out.println("Enter your guess (ex. A2): ");
        String guessLocationString = scan.nextLine();
        guessLocationR = scan.nextLine().charAt(0) - 65;
        guessLocationC = scan.nextLine().charAt(1) - 48;
        guessBoard[guessLocationR][guessLocationC] = 1;
        }
        while((guessLocationR < 65 && guessLocationR > 74) && (guessLocationC < 48 && guessLocationC > 57) );

    }
    
    public void guessHit(int numRows, int numCols, int[][] gameBoard, int guessLocationR, int guessLocationC, int[][] guessBoard){
        if(guessBoard[guessLocationR][guessLocationC] == gameBoard[guessLocationR][guessLocationC])
            guessBoard[guessLocationR][guessLocationC] = 3;
        }
        
    }



}