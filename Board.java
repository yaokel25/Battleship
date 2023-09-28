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
        int sOneC = (int) (Math.random()*10);
        int sOneR = (int) (Math.random()*11);
        gameBoard [sOneR][sOneC] = 1;
        gameBoard [sOneR][sOneC +1] = 1;

        do{
        int sTwoC = (int) (Math.random()*9);
        }
        while (sTwoC != sOneC && sTwoC != (sTwoC + 1))
        int sTwoR = (int) (Math.random()*11);
        gameBoard [sOneR][sOneC] = 1;
        gameBoard [sOneR][sOneC +1] = 1;



        
    }
    //play method
}