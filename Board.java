
import java.util.Scanner;
public class Board{
        Scanner scan = new Scanner(System.in);
        
        
        //print all elements of 2d array
        
        public void printBoard(int[][] gameBoard, int numRows, int numCols){
            for(int j = 0; j < numCols; j++){
            for (int i = 0; i < numRows; i++){
            System.out.print(gameBoard[j][i]);
            }
            System.out.print("\n");
        }
    }
    public Board(boolean fastSlow, int[][] gameBoard, int numRows, int numCols, int[] ships){
        for (int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                gameBoard[i][j] = gameBoard [i][j];
            }
        }
        fastSlow = fastSlow;
        


    }
    
    //setup method-user places 5 battleships
    public void placeShip(boolean fastSlow, int[][] gameBoard, int numRows, int numCols, int[] ships){
        if (fastSlow == false){//if user chooses slow game
        boolean overlap = false;//will be used to check if ships overlap or go off board
        char [] orientation = new char[5];//keep track of vertically placed or horizontally placed (5 ships to keep track of)
        int startingLocationR;//starting row number
        int startingLocationC;//starting column number
        for (int i = 0; i < 5; i++){//repeat 5 times for 5 ships
        //ask if ship is placed horizontally or vertically
         do{   
            System.out.print("Whould you like to place ship horizontally or vertically (H or V)?");
            orientation[i] = scan.nextLine().charAt(0);
        }
        
        while(orientation[i] != 'V' && orientation[i] != 'H');//check for error
        do{//ask for starting coordinates of ships
        System.out.println("What is the starting location of ship of length " + ships[i] + " (ie A2 or B6)");
        String shipLocation = scan.nextLine();
        startingLocationR = (int) shipLocation.charAt(0) - 65; 
        startingLocationC = (int) shipLocation.charAt(1) - 48;
        //check if ships overlap
        if( orientation[i] == 'H' && startingLocationR + (int) ships[i] < 11){//if ship is placed horizontally 
            for (int h = 0; h < ships[i]; h++){
                if(gameBoard[startingLocationR + h][startingLocationC] == 1){
                    overlap = true;
                    break;
                }//if
                else{
                    overlap = false;
                }//else
            }//for loop
        }//if loop
        else if(orientation[i] == 'V' && startingLocationC + (int) ships[i] < 11){//if ship is placed vertically 
            for(int g = 0; g < ships[i]; g++){
                if(gameBoard[startingLocationR][startingLocationC + g] == 1){
                    overlap = true;
                    break;
                }
                else{
                    overlap = false;
                }//else
            }//for loop
        }//else if
        else{
            overlap = true;
        }
    }//do loop
        
        while (overlap == true);
    
        for(int j = 0; j < ships[i]; j++){//places ships
            if(orientation[i] == 'V'){
            gameBoard[startingLocationR + j][startingLocationC] = 1;
        }
        else{
            gameBoard[startingLocationR][startingLocationC +j] = 1;
        }//else
    }//for loop
        

    }
}
        
        
    }//method placeShip
}
        
        



        