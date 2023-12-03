/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package message;


import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;

/**
 *
 * @author DO KHANH TOAN
 */


public class Message {
    private Scanner scanner;
    private Queue<String> messageQueue;
    private Stack<String> messageStack;

    public Message() {
        scanner = new Scanner(System.in);
        messageQueue = new LinkedList<>();
        messageStack = new  Stack<>();
    }

    public void inputMessage() {
        System.out.println("Enter a message (limited to 150 words): ");
        String message = scanner.nextLine();
        if (message.length() > 150) {
            System.out.println("Warning: Message is over 150 words. Only the first 150 words will be saved.");
            message = message.substring(0, 150);
        }
        messageQueue.add(message);
        messageStack.push(message);
    }

    public void sendMessage() {
        String message = messageQueue.remove();
        System.out.println("Sending message: " + message);
    }

    public void viewMessage() {
        String message = messageStack.pop();
        System.out.println("Viewing message: " + message);
    }

    public static void main(String[] args) {
        Message message = new Message();
        message.inputMessage();
        message.sendMessage();
        message.viewMessage();
    }
}