/**
* Instructions.java
* @author Keliang Yao
* @since 10.19.23
* This class prints out the instructions for general, fast, and normal game
*/
public class Instructions{
    
    private boolean gameType1;

    public void printInstructionsGeneral(){//print general instructions 
        System.out.println("Welcome to Battleship!");
        System.out.println("The main objectives is to guess where the opponent's ships are and sink them before they sink yours.");
        System.out.println("To do this, guess locations on the Board in the format 'Row Column' (ex. A2).");
        System.out.println("To start, determine whether you want to play a fast or slow game");
        
    }

    public void printInstructionsSpecific(boolean gameType1){//prints either fast game or normal game instructions
    
        if(gameType1 == true){//Fast game instructions
        System.out.println("Fast game instructions");
    }
    else{//normal game instructions
        System.out.println("The game board for normal game is 10 by 10 spaces.");
        System.out.println("The rows go from A-J and the columns go from 0-9 (the board goes from A0-J9)");
        System.out.println("You can place 5 ships of lengths 2, 3, 3, 4, 5. Please make sure ships do not run off the board or overlap with other ships.");
        System.out.println("After the ships are placed, you can begin placing guesses.");
        
    }
    }//method printInstructionsSpecific

    public void printGuessInstructions(){
        System.out.println("Now that User1 has placed their ships, you can begin placing guesses.");
        System.out.println("The game board for normal game is 10 by 10 spaces.");
        System.out.println("The rows go from A-J and the columns go from 0-9 (the board goes from A0-J9)");
        System.out.println("You need to guess 5 ships of lengths 2, 3, 3, 4, 5. ");
        System.out.println("After your guess, a game board recording your guesses will be printed.");
        System.out.println("A 5 mean the space is unguessed, a 1 means space is guessed but has no ships, and a 3 means a space is guessed and has a ship.");
    }
    }
    public Instructions(boolean fastSlow){
        gameType1 = fastSlow;
    }
    

}