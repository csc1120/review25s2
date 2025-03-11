package wk8.tuesday;

public class MyLinkedList <E> {
    public static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element){
            this.element = element;
            next = null;
        }
    }
    private Node<E> head;
    //not size attribute
    public MyLinkedList(){
        head = null;
    }


    public boolean add(E element){
        Node<E> walker = head;
        if(head == null){
            head = new Node<>(element);
        } else {
//            while (walker.next != null) {
//                walker = walker.next;
//            }
//            walker.next = new Node<>(element);
            getNode(size() - 1).next = new Node<>(element);
        }
        return true;
    }
    public int size(){
        Node<E> walker = head;
        int count = 1;
        if(head == null){
            count = 0;
        } else {
            while(walker.next != null){
                walker = walker.next;
                count++;
            }
        }
        return count;
    }

    public E get(int index){
//        Node<E> walker = head;
//        for(int i = 0; i < index; i++){
//            walker = walker.next;
//        }
        return getNode(index).element;//walker.element;
    }
    private Node<E> getNode(int index){
        //return the node at the given index
        //or null
        Node<E> walker = head;
        for(int i = 0; i < index; i++){
            walker = walker.next;
        }
        return walker;

    }
    public E remove(int index){

        Node<E> prev = getNode(index - 1);
        Node<E> curr = getNode(index);
        Node<E> next = getNode(index + 1);

        prev.next = next;

        return curr.element;

    }

}


//while(walker.next != null){
//walker = walker.next;
//
//        }