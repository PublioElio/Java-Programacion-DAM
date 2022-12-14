package resact_03;

import java.util.Scanner;

/**
 * This program generates a random number between 1 and 100, and the user has to
 * guess it
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class GuessNumber {

    public static void main(String[] args) {
        int secretNum, userNum, tries;

        tries = 0;
        Scanner sc = new Scanner(System.in);
        secretNum = (int) (Math.random() * 100) + 1;
        System.out.print("Guess the secret number between '1' and '100'!! "
                + "(enter a negative number or zero to give up): ");
        userNum = sc.nextInt();
        tries++;
        while ((userNum > 0) && (userNum != secretNum) && (tries != 5)) {

            if (userNum > secretNum) {
                System.out.println("The secret number is lesser");
            } else {
                System.out.println("The secret number is higher");
            }
            System.out.print("Guess the secret number between '1' and '100'!! "
                    + "(enter a negative number to give up): ");
            userNum = sc.nextInt();
            tries++;
        }
        if (userNum == secretNum) {
            System.out.println("You win!!");
        }
        System.out.printf("The secret number is %d. You tried %d times.\n",
                secretNum, tries);
    }
}
