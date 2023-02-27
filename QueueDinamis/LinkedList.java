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
import java.util.NoSuchElementException;

public class LinkedList {

    private ListNode head;
    private int size;

    public LinkedList() {
        head = new ListNode(0);
        head.next = head.previous = head;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void addBefore(Object elemen, ListNode bantu) {

        ListNode baru = new ListNode(elemen);
        baru.next = bantu;
        baru.previous = bantu.previous;
        bantu.previous.next = baru;
        bantu.previous = baru;
        size++;
    }

    public void addFirst(Object elemen) {
        addBefore(elemen, head.next);
    }

    public void addLast(Object elemen) {
        addBefore(elemen, head);
    }

    public Object remove(ListNode bantu) {
        if (bantu == head) {
            throw new NoSuchElementException("Antrian Kosong!");
        }
        Object elemen = bantu.getElemen();
        bantu.previous.next = bantu.next;
        bantu.next.previous = bantu.previous;
        bantu.next = bantu.previous = null;
        size--;
        return elemen;
    }

    public Object removeFirst() {
        return remove(head.next);
    }

    public Object removeLast() {
        return remove(head.previous);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String toString() {
        ListNode bantu = head.getNext();
        String temp = "";
        while (bantu != head) {
            temp += bantu.elemen;
            bantu = bantu.next;
            System.out.println("");
        }
        return temp;
    } 

    public void print() {
        ListNode bantu = head.getNext();
        while (bantu != head) {
            System.out.println(bantu.getElemen() + " ");
            bantu = bantu.getNext();
        }

    }
//    public void searchNode(int value) {  
//        int i = 0;  
//        boolean flag = false;  
//        //Node current will point to head  
//        ListNode current = head;  
//  
//        //Checks whether the list is empty  
//        if(head == null) {  
//            System.out.println("List is empty");  
//            return;  
//        }  
//        while(current != null) {  
//            //Compare value to be searched with each node in the list  
//            if(current.elemen == value) {  
//                flag = true;  
//                break;  
//            }  
//            current = current.next;  
//            i++;  
//            
//        }  
//        if(flag=true)  
//             System.out.println("Simpul "+value+" ditemukan pada posisi ke : " + i);  
//        else  
//             System.out.println("Simpul tidak ditemukan");  
//    }  

    void addLast(Object data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

