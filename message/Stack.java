/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package message;


/**
 *
 * @author DO KHANH TOAN
 */
public class Stack {
   private String[] stack;
    private int top;

    public Stack() {
        stack = new String[10];
        top = -1;
    }

    public void push(String message) {
        stack[++top] = message;
    }

    public String pop() {
        String message = stack[top];
        stack[top] = null;
        top--;
        return message;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}