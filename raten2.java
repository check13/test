import java.util.Scanner;
public class raten2 {
    public static void SelbstRaten() {
        double numberToGuess = (int) (Math.random() * (100 - 1 + 1) + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the first number");
        int nextNumber = scanner. nextInt () ;
        while ( nextNumber != numberToGuess ) {
            if (nextNumber < numberToGuess) {
                System.out.println("The number must be bigger then  " + nextNumber);
                nextNumber = scanner.nextInt() ;
            } else if (nextNumber > numberToGuess){

                System.out.println("The number must be under then " + nextNumber);
                nextNumber = scanner.nextInt();
            }

        } System.out.println("congratulation you guessed the right number ");
    }




    public static void main(String[] args) {

        if (args.length==0){
            SelbstRaten();
        }

    }
}
