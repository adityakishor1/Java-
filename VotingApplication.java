import java.util.Scanner;

// Custom Exception for Underage Voting
class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

public class VotingApplication {
    // Method to check voting eligibility
    public static void checkEligibility(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("You are not eligible to vote. Minimum age required is 18.");
        } else {
            System.out.println("You are eligible to vote. Please proceed!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Checking eligibility
            checkEligibility(age);

        } catch (UnderAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid age.");
        } finally {
            scanner.close();
            System.out.println("Voting Application Closed.");
        }
    }
}
