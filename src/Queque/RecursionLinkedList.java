
package Queque;


public class RecursionLinkedList {
    private class Node {

        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
            
        }

        public Node() {
        }
        

        public Node getNext() {
            return next;
        }
        

        public void setNext(Node next) {
            this.next = next;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
        
        
    }

    private Node head;

    
}
