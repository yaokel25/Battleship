import java.util.Scanner;
public class Tester{
    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
    char fastSlow1;
    
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
    
    
    Board b1 = new Board(fastSlow);
   
    b1.placeShip(fastSlow);
    GamePlay game1 = new GamePlay();
    game1.makeGuess();
    game1.guessHit(b1.numRows, b1.numCols, b1.gameBoard, game1.guessLocationR, game1.guessLocationC, game1.guessBoard);//don't know how to get variables into the call
    

    
    }

}