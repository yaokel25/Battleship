public class Board{

        int numRows = 10;
        int numCols = 10;
        int[] ships = new int[5]; // {2,3,3,4,5}

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
    
    //setup method
    public void placeShip(){
        int s1C = (int) (Math.random()*10);
        int s1R = (int) (Math.random()*11);
        gameBoard [s1R][s1C] = 1;
        gameBoard [s1R][s1C +1] = 1;

        int s1C = (int) (Math.random()*10);
        int s1R = (int) (Math.random()*11);
        gameBoard [s1R][s1C] = 1;
        gameBoard [s1R][s1C +1] = 1;



        
    }
    //play method
}