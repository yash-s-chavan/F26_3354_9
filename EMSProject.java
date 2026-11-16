import java.util.Scanner;

public class EMSProject {
    // Counter so each report gets a unique index
    private static int nextIndex = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        makeIncidentReport(scanner);
        scanner.close();
    }

    public static void makeIncidentReport(Scanner scanner) {
        // Prompt for information
        System.out.print("Enter caller name: ");
        String callerName = scanner.nextLine();
        System.out.print("Enter location: ");
        String location = scanner.nextLine();
        System.out.print("Enter incident: ");
        String incident = scanner.nextLine();

        // Create the index and advance the counter
        int callerIndex = nextIndex;
        nextIndex++;

        System.out.println("\nIncident Reported");

        // Print all variables to verify everything works
        System.out.println("\n--- Incident Report ---");
        System.out.println("Caller Index: " + callerIndex);
        System.out.println("Caller Name:  " + callerName);
        System.out.println("Location:     " + location);
        System.out.println("Incident:     " + incident);
    }
}
