import java.util.Scanner;
public class Board{
        Scanner scan = new Scanner(System.in);
        int numRows = 10;
        int numCols = 10;
        int[] ships = {2,3,3,4,5};
        

        int[][] gameBoard = new int[numRows][numCols];
        for (int b = 0; b < numRows; b++){
            for (int a = 0; a < numCols; a++){
                gameBoard[b][a] = 5;
            }
        }
        
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
        boolean overlap = false;
        char [] orientation = new char[5];//keep track of vertically placed or horizontally placed (5 ships to keep track of)
        int startingLocationR;//starting row number
        int startingLocationC;//starting column number
        for (int i = 0; i < 5; i++){//repeat 5 times for 5 ships
        //ask if ship is placed horizontally or vertically
         do{   
            System.out.print("Whould you like to place ship horizontally or vertically (H or V)?");
            orientation[i] = scan.nextLine().charAt(0);
        }
        
        while(orientation[i] != 'V' && orientation[i] != 'H');
        do{//ask for starting coordinates of ships
        System.out.println("What is the starting location of ship of length " + ships[i] + " (ie A2 or B6)");
        String shipLocation = scan.nextLine();
        startingLocationR = (int) shipLocation.charAt(0) - 65; 
        startingLocationC = (int) shipLocation.charAt(1) - 48;
        //check if ships overlap
        if( orientation[i] == 'H'){
            for (int h = 0; h < ships[i]; h++){
                if(gameBoard[startingLocationR + h][startingLocationC] == '1'){
                    overlap = true;
                }//if
                else{
                    overlap = false;
                }//else
            }//for loop
        }//if loop
        else if(orientation[i] == 'V'){
            for(int g = 0; g < ships[i]; g++){
                if(gameBoard[startingLocationR][startingLocationC + g] == '1'){
                    overlap = true;
                }
                else{
                    overlap = false;
                }//else
            }//for loop
        }//else if
    }//do loop
        
        while ( (orientation[i] == 'H' && (startingLocationR + ships[i])> 11) || (orientation[i] == 'V' && (startingLocationC + ships[i] > 11)) || overlap == false);//check if it is >= 10 or > 10
    
        for(int j = 0; j < ships[i]; j++){//places ships
            if(orientation[i] == 'V'){
            gameBoard[startingLocationR + j][startingLocationC] = '1';
        }
        else{
            gameBoard[startingLocationR][startingLocationC +j] = '1';
        }//else
    }//for loop
        

    }//for loop line 27
        
        



        }//method placeShip
    }//class Board
    
    //play method
