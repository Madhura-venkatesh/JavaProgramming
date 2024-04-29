import java.util.Scanner;

public class TravelPlanner {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Travel Eternally Planner!");

        // Get user input for destination, dates, and preferences
        String destination = getDestination();
        String dates = getDates();
        int preference = getPreference();

        // Generate travel plan
        generateTravelPlan(destination, dates, preference);
    }

    private static String getDestination() {
        System.out.print("Enter your destination: ");
        return scanner.nextLine();
    }

    private static String getDates() {
        System.out.print("Enter your travel dates (e.g., from 2024-05-01 to 2024-05-07): ");
        return scanner.nextLine();
    }

    private static int getPreference() {
        System.out.println("Choose your preference:");
        System.out.println("1. Explore sightseeing spots");
        System.out.println("2. Try local cuisines");
        System.out.println("3. Relax on beaches");
        System.out.print("Enter your preference (1/2/3): ");
        return scanner.nextInt();
    }

    private static void generateTravelPlan(String destination, String dates, int preference) {
        // Display travel plan
        System.out.println("Your Travel Plan:");
        System.out.println("Destination: " + destination);
        System.out.println("Travel Dates: " + dates);

        // Fetch and display maps for the destination
        displayMaps(destination);

        // Fetch and display weather information for the travel dates
        displayWeather(destination, dates);

        // Calculate and display budget based on preferences
        calculateBudget(preference);
    }

    private static void displayMaps(String destination) {
        System.out.println("Map of " + destination + " will be displayed here.");
        // Code to display maps
    }

    private static void displayWeather(String destination, String dates) {
        System.out.println("Weather forecast for " + destination + " during " + dates + " will be displayed here.");
        // Code to fetch and display weather information
    }

    private static void calculateBudget(int preference) {
        double totalBudget = 0.0;
        switch (preference) {
            case 1:
                totalBudget += 500; // Sightseeing expenses
                break;
            case 2:
                totalBudget += 800; // Food expenses
                break;
            case 3:
                totalBudget += 600; // Beach relaxation expenses
                break;
            default:
                break;
        }
        System.out.println("Estimated budget for your trip: $" + totalBudget);
    }
}