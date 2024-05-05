import java.util.Scanner;

public class NoBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the NoBot! Type 'exit' to quit.");
        
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitivity
            
            if (userInput.equals("exit")) {
                System.out.println("NoBot: Fuck you");
                break;
            } else {
                System.out.println("NoBot: No");
            }
        }
        
        scanner.close();
    }
}