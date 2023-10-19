/**
* GamePlay.java
* @author Keliang Yao
* @since 10.19.23
* This class prompts users for guesses and checks the guesses against the original gameBoard and prints out the guessBoard after every guess
*/
import java.util.Scanner;
public class GamePlay{
    Scanner scan = new Scanner(System.in);
    public int guessLocationR;
    public int guessLocationC;
    public int[][] guessBoard = new int[10][10];//10 is size of array
    public void makeGuess(){//places user guess on new guessBoard
        do{
        System.out.print("Enter your guess (ex. A2): ");
        String guessLocationString = scan.nextLine();
        guessLocationR =guessLocationString.charAt(0) - 65;//Ascii conversion (65=A)
        guessLocationC = guessLocationString.charAt(1) - 48;//Ascii conversion (48=0)
        guessBoard[guessLocationR][guessLocationC] = 1;
        }
        while((guessLocationR < 0 && guessLocationR > 9) && (guessLocationC < 0 && guessLocationC > 9) );//making sure inputs are from A-J and 0-9 with their ascii values  

    }
    
    public boolean guessHit(int numRows, int numCols, int[][] gameBoard, int guessLocationR, int guessLocationC, int[][] guessBoard, boolean fastSlow){//check if any ships were hit
        Board b2 = new Board(fastSlow);
        
            if(gameBoard[guessLocationR][guessLocationC] == 1){
            guessBoard[guessLocationR][guessLocationC] = 3;
            System.out.println("You have hit a ship");
            b2.printBoardNormal(guessBoard);
            return true;
            }
            else if(gameBoard[guessLocationR][guessLocationC] != 1){
                System.out.println("You have not hit any ships");
                return false;
            }
            else{
                return false;
            }
            
        
            
           
        
    }



}