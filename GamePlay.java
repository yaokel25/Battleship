import java.util.Scanner;
public class GamePlay{
    Scanner scan = new Scanner(System.in);
    private char guessLocationR;
    private char guessLocationC;
    public void makeGuess(){
        do{
        System.out.println("Enter your first guess (ex. A2): ")
        String guessLocationString = scan.nextLine();
        guessLocationR = scan.nextLine().charAt(0);
        guessLocationC = scan.nextLine().charAt(1);
        }
        while((guessLocationR < 65 && guessLocationR > 74) && (guessLocationC < 48 && guessLocationC > 57) );

    }
    
    public void guessHit(){

    }



}