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
        guessLocationR = scan.nextLine().charAt(0) - 65;//Ascii conversion (65=A)
        guessLocationC = scan.nextLine().charAt(1) - 48;//Ascii conversion (48=0)
        guessBoard[guessLocationR][guessLocationC] = 1;
        }
        while((guessLocationR < 0 && guessLocationR > 9) && (guessLocationC < 0 && guessLocationC > 9) );//making sure inputs are from A-J and 0-9 with their ascii values  

    }
    
    public void guessHit(int numRows, int numCols, int[][] gameBoard, int guessLocationR, int guessLocationC, int[][] guessBoard){
        boolean checkBoard = false;
        if(guessBoard[guessLocationR][guessLocationC] == gameBoard[guessLocationR][guessLocationC]){
            guessBoard[guessLocationR][guessLocationC] = 3;
        }
        for(int i = 0; i < numRows; i++){//checking if users guessed all ship locations
            for(int j = 0; j < numCols; j++){
                if(guessBoard[i][j] == gameBoard[i][j]){
                    checkBoard = true;
                    System.out.print("You guessed all the ships!");
                }
                else if(guessBoard[i][j] != gameBoard[i][j]){
                    checkBoard = false;
                    break;
                }
                else{
                    break;
                }
            }
        }
        
    }



}