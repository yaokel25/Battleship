import java.util.Scanner;
public class Board{
        Scanner scan = new Scanner(System.in);
        int numRows = 10;
        int numCols = 10;
        int[] ships = {2,3,3,4,5};
        

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
        do{
            System.out.print("Whould you like to place ship horizontally or vertically (H or V)?");
            orientation[i] = scan.nextLine().toUpperCase().charAt(0);
        }
        while(orientation[i] != 'V' || orientation[i] != 'H');
        do{
        System.out.println("What is the starting location of ship of length " + ships[i] + " (ie 22 or 46)");
        String shipLocation = scan.nextLine();
        int startingLocationR = (int) shipLocation.charAt(0) - 65; 
        int startingLocationC = (int) shipLocation.charAt(1) - 48;
        boolean overlap;
        if( orientation[i] == 'H'){
            for (int h = 0; h < ships[i]; h++){
                if(gameBoard[startingLocationR + h][startingLocationC] == '1'){
                    overlap = true;
                }
                else{
                    overlap = false;
                }
            }
        }
        else if(orientation[i] == 'V'){
            for(int g = 0; g < ships[i]; g++){
                if(gameBoard[startingLocationR][startingLocationC + g] == '1'){
                    overlap = true;
                }
                else{
                    overlap = false;
                }
            }
        }
    }
        
        while ( (orientation[i] == 'H' && (startingLocationR + ships[i])> 10) || (orientation[i] == 'V' && (startingLocationC + ships[i] > 10)) || overlap == false)
    
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
