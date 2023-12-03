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
public class Stack<T> {
    private Note<T> top;

    public Stack() {
        top = null;
    }

    public void push(T data) {
        Note<T> newNode = new Note<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
