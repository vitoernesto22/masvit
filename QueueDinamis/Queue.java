/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueueDinamis;

/**
 *
 * @author ACER
 */
public class Queue {

    LinkedList elemen;
    private int front, rear, size;

    public Queue() {
        elemen = new LinkedList();
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean enqueue(Object data) {

        elemen.addLast(data);
        size++;
        return true;

    }

    public boolean isEmpty() {
        if (getSize() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Object deque() {
        return elemen.removeFirst();
    }

    public int getSize() {
        return size;
    }

    void enqueue(Mahasiswa mhs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
