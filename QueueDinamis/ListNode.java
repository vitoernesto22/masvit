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
public class ListNode {
      
    Object elemen;
    ListNode next, previous;

    public ListNode(Object elemen) {
        this.elemen = elemen;
        this.next = null;
        this.previous = null;
    }

    public ListNode(Object elemen, ListNode next, ListNode previous) {
        this.elemen = elemen;
        this.next = next;
        this.previous = previous;
    }

    public void setElemen(Object elemen) {
        this.elemen = elemen;
    }

    public Object getElemen() {
        return elemen;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrevious() {
        return previous;
    }

    public void setPrevious(ListNode previous) {
        this.previous = previous;
    }

}
