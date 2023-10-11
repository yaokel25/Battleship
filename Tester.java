import java.util.Scanner;
public class Tester{
    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
    char fastSlow1;
    int numRows = 10;
    int numCols = 10;
    int[] ships = {2,3,3,4,5};
    int[][] gameBoard = new int[numRows][numCols];
    for (int b = 0; b < numRows; b++){
        for (int a = 0; a < numCols; a++){
            gameBoard[b][a] = 5;
        }
    }
    boolean fastSlow = false;//will be used to check if user plays fast or slow game
    Instructions instruc1 = new Instructions (fastSlow);//new instructions object
    instruc1.printInstructionsGeneral();//print general instructions
    
    do{//ask user to play fast or slow game
    System.out.println("Would you like to play a fast game or slow game? (enter F or S)");
    fastSlow1 = scan.nextLine().charAt(0);
    }
    while(fastSlow1 != 'F' && fastSlow1 != 'S');    
    
    if(fastSlow1 == 'S'){//slow game when fastSlow is false
        fastSlow = false;
    }
    else if(fastSlow1 == 'F'){//fast game when fastSlow is true
        fastSlow = true;
    }
    instruc1.printInstructionsSpecific(fastSlow);//print game specific instructions
    
    
    Board b1 = new Board(fastSlow, gameBoard, numRows, numCols, ships);
   
    b1.placeShip(fastSlow, gameBoard, numRows, numCols, ships);
    
    

    
    }

}