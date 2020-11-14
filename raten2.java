import java.util.Scanner;
public class raten2 {
    public static void computerRaten (double numberToGuess){
        if (numberToGuess>0 &&  numberToGuess<101){
            int numberOfGuesses = 0;
            boolean check = false;
            while(!check){
                double computerGuess = (int)(Math.random() * (101)+1);
                numberOfGuesses=numberOfGuesses+1;
                if (computerGuess==numberToGuess){
                    System.out.println("number of guesses: "+numberOfGuesses);
                    check=true;
                }

            }
        }else {
            System.out.println("the number to guess must be between 1 and 100");
        }


    public static void SelbstRaten() {
        double numberToGuess = (int) (Math.random() * (100 - 1 + 1) + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the first number");
        int nextNumber = scanner. nextInt () ;
        while ( nextNumber != numberToGuess ) {
            if (nextNumber < numberToGuess) {
		    B
                System.out.println("The number must be bigger then  " + nextNumber);
                nextNumber = scanner.nextInt() ;
            } else if (nextNumber > numberToGuess){

                System.out.println("The number must be under then " + nextNumber);
                nextNumber = scanner.nextInt();
            }

        } System.out.println("congratulation you guessed the right number ");

    }




    public static void main(String[] args) {

        if (args.length>0){
            computerRaten(Double.parseDouble(args[0]));
	}else{
	    SelbstRaten();
        }

    }
}
