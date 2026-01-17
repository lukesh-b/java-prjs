package funloan;

import java.util.Scanner;

/**
 FriendLoanAdvisor
 Determines (in a funny way) if you should lend more money to a friend who already owes you.
 */

public class FriendLoanAdvisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Friend Loan Advisor ===");

        // Predefined amount owed
        double alreadyOwed = 1000; // Your friend already owes $1000
        System.out.println("Your friend already owes you $" + alreadyOwed + "!");

        System.out.print("How many times have they returned your money late? ");
        int lateReturns = scanner.nextInt();

        System.out.print("On a scale of 1-10, how persuasive are they asking for more? ");
        int persuasionLevel = scanner.nextInt();

        boolean canLend = evaluateFriendLoan(alreadyOwed, lateReturns, persuasionLevel);

        showDecision(canLend);

        scanner.close();
    }

    /**
     * Evaluates whether you should lend more money.
     *
     * Criteria:
     * - Max safe owed amount: $500
     * - Max late returns: 3
     * - Persuasion bonus: >8 may get a "tiny loan"
     *
     * @param owedAmount How much they already owe
     * @param lateReturns Number of times they returned late
     * @param persuasionLevel Persuasiveness 1-10
     * @return true if you can lend, false otherwise
     */
    public static boolean evaluateFriendLoan(double owedAmount, int lateReturns, int persuasionLevel) {
        final double MAX_SAFE_OWED = 500;
        final int MAX_LATE_RETURNS = 3;
        final int PERSUASION_THRESHOLD = 8;

        if (owedAmount <= MAX_SAFE_OWED && lateReturns <= MAX_LATE_RETURNS) {
            return true; // Safe to lend
        } else if (persuasionLevel > PERSUASION_THRESHOLD) {
            System.out.println(" Dyaumm!! they are super persuasive…, maybe a tiny loan?");
            return true;
        } else {
            return false; // Too risky
        }
    }

    /**
     * Displays the decision in a funny way.
     */
    public static void showDecision(boolean canLend) {
        if (canLend) {
            System.out.println(" You decided to lend some money… Good luck getting it back!");
        } else {
            System.out.println("Nope! Tell them 'no more loans' and run away!");
        }
    }
}

