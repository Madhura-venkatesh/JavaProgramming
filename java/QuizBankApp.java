import java.util.Scanner;

public class QuizBankApp {
    private static Scanner scanner = new Scanner(System.in);
    private static double balance = 0.0;

    public static void main(String[] args) {
        System.out.println("Welcome to Quiz Bank!");
        System.out.println("1. Take Quiz");
        System.out.println("2. Bank Operations");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                takeQuiz();
                break;
            case 2:
                bankOperations();
                break;
            case 3:
                System.out.println("Exiting the program. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                main(args);
        }
    }

    private static void takeQuiz() {
        // Your quiz implementation here
        System.out.println("This is where the quiz will be implemented.");
        main(null); // Go back to the main menu after finishing the quiz
    }

    private static void bankOperations() {
        System.out.println("Welcome to Quiz Bank - Banking Operations");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Exiting the banking operations.");
                main(null); // Go back to the main menu
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                bankOperations();
        }
    }

    private static void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposit successful.");
        bankOperations(); // Go back to banking operations menu
    }

    private static void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
        bankOperations(); // Go back to banking operations menu
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
        bankOperations(); // Go back to banking operations menu
    }
}