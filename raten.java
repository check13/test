import java.util.Scanner;

public class raten {
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
    }




    public static void main(String[] args) {
        //System.out.println(java.util.Arrays.toString(args));
        if (args.length>0){
            //System.out.println(java.util.Arrays.toString(args));
            //System.out.println(Double.parseDouble(args[0]));
            computerRaten(Double.parseDouble(args[0]));
        }

    }
}
