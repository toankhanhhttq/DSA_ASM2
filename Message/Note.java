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
public class Note<T> {
    T data;
    Note<T> next;

    public Note(T data) {
        this.data = data;
        this.next = null;
    }
}
