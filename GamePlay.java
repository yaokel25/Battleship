import java.util.Scanner;
public class GamePlay{
    Scanner scan = new Scanner(System.in);
    public int guessLocationR;
    public int guessLocationC;
    public int[][] guessBoard = new int[10][10];//10 is size of array
    public void makeGuess(){
        do{
        System.out.print("Enter your guess (ex. A2): ");
        String guessLocationString = scan.nextLine();
        guessLocationR =guessLocationString.charAt(0) - 65;//Ascii conversion (65=A)
        guessLocationC = guessLocationString.charAt(1) - 48;//Ascii conversion (48=0)
        guessBoard[guessLocationR][guessLocationC] = 1;
        }
        while((guessLocationR < 0 && guessLocationR > 9) && (guessLocationC < 0 && guessLocationC > 9) );//making sure inputs are from A-J and 0-9 with their ascii values  

    }
    
    public void guessHit(int numRows, int numCols, int[][] gameBoard, int guessLocationR, int guessLocationC, int[][] guessBoard, boolean fastSlow){
        boolean checkBoard = false;
        Board b2 = new Board(fastSlow);
        do {
            for ( int i = 0; i < 5; i++){//check if user guessed all the ships, there are 5 ships
            for(int k = 0; k < numRows; k ++){
                for(int u = 0; u < numCols; u++){
                    if( gameBoard[k][u] == 5){
                        if(guessBoard[u][k] ==5 || guessBoard[u][k] == 1){
                            checkBoard = true;
                        }
                        else{
                            checkBoard = false;
                            break;
                        }
                    }
                    else if(gameBoard[k][u] == 1){
                        if(guessBoard[k][u] == 3){
                            checkBoard = true;
                        }
                        else{
                            checkBoard = false;
                            break;
                        }
                    }
                    else{
                        checkBoard = false;
                        break;
                    }
                    if(checkBoard == true){
                        System.out.print("You guessed all the ships!");
                    }
                    else{
                        break;
                    }
                }
            }
        }
    
            if(gameBoard[guessLocationR][guessLocationC] == 1){
            guessBoard[guessLocationR][guessLocationC] = 3;
            System.out.println("You have hit a ship");
            b2.printBoardNormal(guessBoard);
            }
            else if(gameBoard[guessLocationR][guessLocationC] != 1){
                System.out.println("You have not hit any ships");
            }
            else{

            }
        }
        while(checkBoard == false);
        
        
    }



}