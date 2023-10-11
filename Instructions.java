public class Instructions{
    
    private boolean gameType1;

    public void printInstructionsGeneral(){//print general instructions 
        System.out.println("Welcome to Battleship!");
        System.out.println("The main objectives is to guess where the opponent's ships are and sink them before they sink yours.");
        System.out.println("To start, determine whether you want to play a fast or slow game and where to place your ships.");
        
    }

    public void printInstructionsSpecific(boolean gameType1){//prints either fast game or normal game instructions
    
        if(gameType1 == true){
        System.out.println("Fast game instructions");
    }
    else{
        System.out.println("Normal game instructions");
    }
    }//method printInstructionsSpecific
    public Instructions(boolean fastSlow){
        gameType1 = fastSlow;
    }
    

}