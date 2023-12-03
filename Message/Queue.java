/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder2.Message;

/**
 *
 * @author DO KHANH TOAN
 * @param <T>
 */
public class Queue<T> {
    private Note<T> front;
    private Note<T> rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(T data) {
        Note<T> newNote = new Note<>(data);

        if (isEmpty()) {
            front = newNote;
            rear = newNote;
        } else {
            rear.next = newNote;
            rear = newNote;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }

        T data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
