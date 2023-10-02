import java.util.Scanner;
public class Board{

        int numRows = 10;
        int numCols = 10;
        int[] ships = {2,3,3,4,5};
        Scanner scan = new Scanner(System.in); 

        int[][] gameBoard = new int[numRows][numCols];
        
        //print all elements of 2d array
        public void printBoard(){
            for(int j = 0; j < numCols; j++){
            for (int i = 0; i < numRows; i++){
            System.out.print(gameBoard[j][i]);
            }
            System.out.print("\n");
        }
    }
    
    //setup method-user places 5 battleships
    public void placeShip(){
        
        char [] orientation = new char[5];//keep track of vertically placed or horizontally placed (5 ships to keep track of)
        for (int i = 0; i < 5; i++){
        System.out.print("Whould you like to place ship horizontally or vertically (V or H)?");
        orientation[i] = scan.nextLine().charAt(0);
        System.out.println("What is the starting location of length " + ships[i]);
        String shipLocation = scan.nextLine().toUpperCase();
        int startingLocationR = (int) shipLocation.charAt(0) - 65; 
        int startingLocationC = (int) shipLocation.charAt(1) - 48;
        for(int j = 0; j < ships[i]; j++){
            if((int) orientation[i] == 86){
            gameBoard[startingLocationR + j][startingLocationC] = '1';
        }
        else{
            gameBoard[startingLocationR][startingLocationC +j] = '1';
        }
    }
        

    }
        
        



        }
    }
    //play method
