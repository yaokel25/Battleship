import java.util.Scanner;
public class Board{

        int numRows = 10;
        int numCols = 10;
        int[] ships = new int[5]; // {2,3,3,4,5}
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
    
    //setup method
    public void placeShip(){
        /*int sOneC = (int) (Math.random()*10);
        int sOneR = (int) (Math.random()*11);
        gameBoard [sOneR][sOneC] = 1;
        gameBoard [sOneR][sOneC +1] = 1;

        do{
        int sTwoC = (int) (Math.random()*9);
        }
        while (sTwoC != sOneC && sTwoC != (sTwoC + 1))
        
        gameBoard [sTwoR][sTwoC] = 1;
        gameBoard [sOneR][sOneC +1] = 1;*/
        System.out.println("Enter the location for your first ship (2 blocks): ");
        String ship1 = scan.nextLine();
        System.out.println("Enter the location for your second ship (3 blocks): ");
        String ship2 = scan.nextLine();
        System.out.println("Enter the location for your third ship (3 blocks): ");
        String ship3 = scan.nextLine();
        System.out.println("Enter the location for your fourth ship (4 blocks): ");
        String ship4 = scan.nextLine();
        System.out.println("Enter the location for your fifth ship (5 blocks): ");
        String ship5 = scan.nextLine();
        



        }
    //play method
}