import java.util.Arrays;

public class Board2save {
    public void placeShip(boolean fastSlow, int[][] gameBoard, int numRows, int numCols, int[] ships){
        if (fastSlow == false){
        boolean[] overlap;
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
        if( orientation[i] == 'H' && startingLocationR + (int) ships[i] < 11){
            for (int h = 0; h < ships[i]; h++){
                if(gameBoard[startingLocationR + h][startingLocationC] != 1){
                    overlap[h] = false;
                }//if
                else{
                    overlap[h] = true;
                }//else
            }//for loop
        }//if loop
        else if(orientation[i] == 'V' && startingLocationC + (int) ships[i] < 11){
            for(int g = 0; g < ships[i]; g++){
                if(gameBoard[startingLocationR][startingLocationC + g] != 1){
                    overlap[g] = false;
                }
                else{
                    overlap[g] = true;
                }//else
            }//for loop
        }//else if
        else{
            overlap[0] = true;
        }
    }//do loop
        
        while ( Arrays.);//check if it is >= 10 or > 10 and if ships overlap
    
        for(int j = 0; j < ships[i]; j++){//places ships
            if(orientation[i] == 'V'){
            gameBoard[startingLocationR + j][startingLocationC] = 1;
        }
        else{
            gameBoard[startingLocationR][startingLocationC +j] = 1;
        }//else
    }//for loop
        

    }//for loop line 27
}
        
        



        }
}
