package wk9.monday;

public class MyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node(E element){
            this.element = element;
            next = null;
        }
        private Node(E element, Node<E> next){
            this.element = element;
            this.next = next;
        }
    }
    Node<E> head;
    // int size;
    public MyLinkedList(){

    }
    public int size(){
        Node<E> walker = head;
        int count = 1;
        if(walker == null){
            count = 0;
        } else {
            while (walker.next != null) {
                walker = walker.next;
                count++;
            }
        }
        return count;
    }

    public boolean add(E element){
        if(head == null){
            head = new Node<>(element);
        } else {
            Node<E> last = getNode(size() - 1);
            last.next = new Node<>(element);
        }
        return true;
    }
    private Node<E> getNode(int index){
        Node<E> walker = head;
        for(int i = 0; i<index; i++){
            walker = walker.next;
        }
        return walker;
    }
    public E get(int index){
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException("Invalid index "+index+" for size() "+size());
        }
        return getNode(index).element;
    }
    public E remove(int index){
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException("Invalid index "+index+" for size() "+size());
        }
        //if the index is 0
        if(index == 0){
            head = head.next;
            Node<E> ret = head;
            return ret.element;
        } else {
            //if the size is more than 1
            Node<E> prev = getNode(index - 1);
            Node<E> curr = getNode(index);
            Node<E> next = curr.next;
            prev.next = next;
            return curr.element;
        }


    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int s = size();
        for(int i = 0; i<s; i++){
            sb.append(get(i) + " ");
        }
        sb.append("]");
        return sb.toString();
    }

}
