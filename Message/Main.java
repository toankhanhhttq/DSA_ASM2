/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder2.Message;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DO KHANH TOAN
 */
public class Main {
    public static void main(String[] args) {
        Queue<String> messageQueue = new Queue<>();
        Stack<String> messageStack = new Stack<>();

        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            do {
                System.out.println("Menu:");
                System.out.println("1. Input Message");
                System.out.println("2. Send Message");
                System.out.println("3. View Messages");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> inputMessage(scanner, messageQueue);
                    case 2 -> sendMessage(messageQueue, messageStack);
                    case 3 -> viewMessages(messageStack);
                    case 4 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 4);
        }
    }

    private static void inputMessage(Scanner scanner, Queue<String> messageQueue) {
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();

        while (message.length() >= 250) {
        System.out.println("Warning: String length exceeds 250 characters.");
        System.out.print("Please re-enter the message (less than 250 characters): ");
        message = scanner.nextLine();
    }

    String timestampedMessage = "[" + new Date() + "] " + message;
    messageQueue.enqueue(timestampedMessage);
    System.out.println("Message successfully added.");    
    }

    private static void sendMessage(Queue<String> messageQueue, Stack<String> messageStack) {
        if (messageQueue.isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        }

        while (!messageQueue.isEmpty()) {
            String message = messageQueue.dequeue();
            messageStack.push(message);
        }

        System.out.println("Messages sent and stored in the stack.");
    }

    private static void viewMessages(Stack<String> messageStack) {
        if (messageStack.isEmpty()) {
            System.out.println("No messages in the stack.");
            return;
        }

        System.out.println("Messages currently in the stack:");
        while (!messageStack.isEmpty()) {
            String message = messageStack.pop();
            System.out.println(message);
            
        }
        try {
            while (!messageStack.isEmpty()) {
              String message = messageStack.pop();
                System.out.println(message);
            }
        } catch (Exception e) {
            System.out.println("Error occurred while viewing messages: " + e.getMessage());
        }
    }
}
