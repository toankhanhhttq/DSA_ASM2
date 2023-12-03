/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package message;


/**
 *
 * @author DO KHANH TOAN
 */
public class Queue {
    private String[] queue;
    private int front;
    private int rear;

    public Queue() {
        queue = new String[10];
        front = 0;
        rear = 0;
    }

    public void enqueue(String message) {
        if (rear == queue.length) {
            // Queue is full
            System.out.println("Queue is full");
            return;
        }

        queue[rear] = message;
        rear++;
    }

    public String dequeue() {
        if (front == rear) {
            // Queue is empty
            System.out.println("Queue is empty");
            return null;
        }

        String message = queue[front];
        queue[front] = null;
        front++;
        return message;
    }

    public boolean isEmpty() {
        return front == rear;
        
    }
}
