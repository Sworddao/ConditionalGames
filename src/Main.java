import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isCarStarted = false;

        while (true) {
            System.out.println("Enter a Command (start, stop, quit):");
            String command = input.nextLine().toLowerCase();

            if (command.equals("start")) {
                if (isCarStarted) {
                    System.out.println("Car is already started.");
                } else {
                    isCarStarted = true;
                    System.out.println("The car has started.");
                }
            }
            else if (command.equals("stop")) {
                if (!isCarStarted) {
                    System.out.println("Car is already stopped.");
                } else {
                    isCarStarted = false;
                    System.out.println("The car has stopped.");
                }
            }
            else if (command.equals("quit")) {
                System.out.println("Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid command.");
            }
        }
    }
}
